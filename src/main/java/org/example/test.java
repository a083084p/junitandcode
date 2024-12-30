package org.example;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        int[] myArr = {};

        System.out.println(mySort(myArr));
    }

    public static String mySort(int[] arr) {

        Arrays.sort(arr);
        String value = "none";

        for (int i=arr.length-1; i>0; i--) {
            if (arr[i] > arr[i-1] ) {
                return Integer.toString(arr[i-1]);
            }
        }

        return value;

    }




}
