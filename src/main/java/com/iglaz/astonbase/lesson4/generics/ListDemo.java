package com.iglaz.astonbase.lesson4.generics;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

public class ListDemo {
    public static void main(String[] args) {
//        Deque<String> names = new LinkedList<>();
//
//        GenList<String> stringGenList = new GenList<String>(12);

        List<Integer> integers = List.of(234, 234, 234);

        List<Integer> list = Arrays.asList(2342, 23423, 234);

        Set.of();

        Map.of(23, "sdfa", 2424, "sdfa");

        Map.ofEntries(entry(232, "asdfa"), entry(2342, "sdfa"));

        integers.add(234);

//        GenList.sort(List.of(234, 234, 234));
    }
}
