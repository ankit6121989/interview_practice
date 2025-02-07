package com.interviewproblems;

public class MaxNumberFromArray {
    void main(){
        int[] arr = {3,6,1,4,7};
        findMax(arr);
    }

    private void findMax(int[] arr) {
        int max = 0;
        for(int i=0; i< arr.length;i++){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
