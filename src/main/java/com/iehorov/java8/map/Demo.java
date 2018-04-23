package com.iehorov.java8.map;

import java.util.Arrays;
import java.util.List;

/**
 * Username: dummy_user
 * Date: 23.04.2018
 * Time: 20:32
 */
public class Demo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);

        numbers.stream()
                .map(integer -> integer * integer)
                .forEach(System.out::println);
        numbers.stream()
                .map(Object::toString)
                .forEach(System.out::println);
    }
}
