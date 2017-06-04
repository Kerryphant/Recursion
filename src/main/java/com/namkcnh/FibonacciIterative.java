package com.namkcnh;

/**
 * Created by Kerry on 02/06/2017.
 */
public class FibonacciIterative {

    public int[] fibFunction(int n) {

        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;


        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }


        return array;
    }
}

