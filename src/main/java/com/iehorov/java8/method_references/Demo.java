package com.iehorov.java8.method_references;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Username: dummy_user
 * Date: 18.04.2018
 * Time: 20:20
 */
public class Demo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3", "4");

        List<Integer> integers = strings.stream().map(Integer::valueOf).collect(Collectors.toList());
    }
}
