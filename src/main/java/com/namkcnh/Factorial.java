package com.namkcnh;

/**
 * Created by Kerry on 02/06/2017.
 */
public class Factorial {

    public int calcFactorial(int n){

        if (n == 1){
            return 1;
        }
        else{
            return n * calcFactorial(n - 1);
        }

    }

}
