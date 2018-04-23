package com.iehorov.java8.find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Username: dummy_user
 * Date: 23.04.2018
 * Time: 20:46
 */
public class Demo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("BLOB", "Java is the best", "Java 8", "Java 9", "Jacoco");

        Optional<String> java = strings.parallelStream()
                .filter(word->word.contains("Java"))
                .findAny();

        System.out.println(java.get());
    }
}
