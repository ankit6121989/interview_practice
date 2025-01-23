package com.interviewproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OccurrenceOfACharInString {
    public static void main(String[] args) {
       // Occurrence of each character in a string
        String str = "This is a sample program";
        Map<String, String> map = Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s-> s,HashMap::new,Collectors.joining()));
        System.out.println(map);
        // Printing a map using method reference
        map.entrySet().forEach(System.out::println);
    }
}