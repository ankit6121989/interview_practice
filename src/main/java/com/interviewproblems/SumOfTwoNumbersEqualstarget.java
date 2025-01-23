package com.interviewproblems;

public class SumOfTwoNumbersEqualstarget {
    public static void main(String[] args) {
        int[] arr= {3,4,5,1,4,2};
        int target = 6;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+arr[i+1]==target)
                System.out.println("{"+arr[i]+","+arr[i+1]+"}");
        }
    }
}
