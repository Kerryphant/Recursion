package com.namkcnh;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @org.junit.Test

    public void returnStringTest(){

        TestClass obj = new TestClass();

        Assert.assertEquals("Hello", obj.returnString("Hello"));

        //Assert.assertEquals(obj.returnString("World"), "Hello");


    }


}
