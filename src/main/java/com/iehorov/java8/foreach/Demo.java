package com.iehorov.java8.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Username: dummy_user
 * Date: 23.04.2018
 * Time: 20:22
 */
public class Demo {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("2", "3", "4");

        List<Integer> collect = stringList.stream().map(Integer::valueOf).collect(Collectors.toList());

        collect.stream().filter(x -> x % 2 == 0).forEach(System.out::print);

    }
}

