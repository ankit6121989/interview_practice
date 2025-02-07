package com.interviewproblems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MapOfCharLengthAndName {

    public static void main(String[] args) {
        String s = "mohan nagare vaibhav shukla homan vaibhva avc xyze";
        System.out.println(Arrays.stream(s.split(" ")).collect(Collectors.toMap(s1->s1.length(), s1->s1,(s1, s2) -> s1+"," +s2)));
        System.out.println(Arrays.stream(s.split(" ")).collect(Collectors.counting()));
        System.out.println(Arrays.stream(s.split(" ")).reduce((s1,s2)-> s1+"*"+s2).get()


        );
    }

}
