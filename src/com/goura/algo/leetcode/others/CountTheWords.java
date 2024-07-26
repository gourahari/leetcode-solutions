package com.goura.algo.leetcode.others;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountTheWords {
    private static final String FILE = "declaration_of_independence.txt";
    private static final List<String> ignoredWords = Arrays.asList("of", "the", "to", "and", "&", "for");
    private static final int LIMIT = 100;

    public static void main(String[] args) {
        // Answer to the first part of the question to invert the declaration of independence.
        // Load the file content into a String variable
        String decl_of_ind;
        try(BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            decl_of_ind = br.lines()
                    .collect(Collectors.joining("\n"));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return;
        }
        String reversed = reverseWords(decl_of_ind);
        System.out.println(reversed);

        // Answer to the second part of the question to count the words in the declaration of independence.
        // Load the file content into memory
        try(BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            Map<String, Long> wordGroup = br.lines()
                    .flatMap(line -> Stream.of(line.split("\\s+")))
                    .map(String::toLowerCase)
                    // If a word ends with comma(,) or period(.), remove the comma/period
                    .map(word -> {
                        if (word.endsWith(".") || word.endsWith(",")) {
                            return word.substring(0, word.length() - 1);
                        }
                        return word;
                    })
                    // filter out the common words defined above.
                    .filter(word -> !ignoredWords.contains(word))
                    // Remove empty words
                    .filter(word -> !word.isEmpty())
                    // Group the words by their count.
                    .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));

            wordGroup.entrySet().stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                    // Limit to max <LIMIT> most common words.
                    .limit(LIMIT)
                    // Convert them into CSV fomat. Count first and then the word itself.
                    .map(e -> String.format("%s, %s", e.getValue(), e.getKey()))
                    // print them.
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static String reverseWords(String paragraph) {
        // Split the paragraph into an array of words
        String[] words = paragraph.split("\\s+");

        // Reverse the array of words
        List<String> wordList = Arrays.asList(words);
        Collections.reverse(wordList);

        // Join the reversed words back into a string
        return String.join(" ", wordList);
    }
}
