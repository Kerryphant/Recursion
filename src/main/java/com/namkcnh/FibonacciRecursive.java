package com.namkcnh;

/**
 * Created by Kerry on 02/06/2017.
 */
public class FibonacciRecursive {

    int pre1 = 0;
    int pre2 = 1;
    int next = 0;

    public int[] startFib(int n){

       int[] array = new int[n];
      array[0] = 0;
       array[1] = 1;
       return fibFunction(n - 2, array);
    }

    private int[] fibFunction(int n, int[] array){

        if(n>0){

            next = pre1 + pre2;
            array[array.length - n] = next;

            pre1 = pre2;
            pre2 = next;

            return fibFunction(n-1, array);
        }

        return array;
    }

}
