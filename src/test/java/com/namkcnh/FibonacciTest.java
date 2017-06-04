package com.namkcnh;

import org.junit.Assert;

/**
 * Created by Kerry on 02/06/2017.
 */
public class FibonacciTest {

    @org.junit.Test

    public void startFibTest(){

        FibonacciRecursive obj = new FibonacciRecursive();

        int count = 10;
        int[] expected = new int[]{0,1,1,2,3,5,8,13,21,34};

        int[] actual = obj.startFib(count);

        for(int i = 0; i < actual.length; i++){

            Assert.assertEquals(expected[i], actual[i]);

        }

    }

    @org.junit.Test

    public void startSecFibTest(){

        FibonacciIterative objIter = new FibonacciIterative();

        int count = 10;
        int[] expected = new int[]{0,1,1,2,3,5,8,13,21,34};

        int[] actual = objIter.fibFunction(count);

        for(int i = 0; i < actual.length; i++){
                Assert.assertEquals(expected[i], actual[i]);
        }

    }



}
