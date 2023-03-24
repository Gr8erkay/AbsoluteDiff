package org.gr8erkay;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //To be printed in ascending order

//       Array of numbers = [6,2,4,10]
//
//        The minimum absolute difference is 2 and the pairs with that difference are (2,4) and (4,6). When printing element pairs (i,j), they should be ordered ascending first by i and then by j.
//
//        2 4
//        4 6
//        int[] numbers = {6, 2, 4, 10};
        int[] numbers = {5, 1, 99, 200, 4, 3, 2};

        Arrays.sort(numbers);
        int minDifference = Integer.MAX_VALUE;
        for (int i = 1; i < numbers.length; i++) {
            int difference = Math.abs(numbers[i] - numbers[i - 1]);
            
            if (difference < minDifference) {
                minDifference = difference;
            }
        }
        for (int i = 1; i < numbers.length; i++) {
            int difference = Math.abs(numbers[i] - numbers[i - 1]);
            if (difference == minDifference) {
                System.out.printf("(%d,%d) ", numbers[i - 1], numbers[i]);
            }
        }
    }
}