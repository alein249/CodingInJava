package com.company.Basic;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortDescending {
    public static void main(String[] args)
    {
        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }
}
// A sample Java program to sort a array
// in descending order using Arrays.sort().