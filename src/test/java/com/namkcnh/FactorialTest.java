package com.namkcnh;

import org.junit.Assert;

/**
 * Created by Kerry on 02/06/2017.
 */
public class FactorialTest {

    @org.junit.Test

    public void calcFactorialTest(){

        Factorial obj = new Factorial();

        Assert.assertEquals(24, obj.calcFactorial(4));
        Assert.assertEquals(120, obj.calcFactorial(5));
        Assert.assertEquals(720, obj.calcFactorial(6));

    }


}
