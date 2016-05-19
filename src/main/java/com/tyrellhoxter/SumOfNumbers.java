package com.tyrellhoxter;

import java.util.Scanner;

/**
 * Created by tyrellhoxter on 5/19/16.
 */
public class SumOfNumbers {

    public int sum;
    public int Sum1ToNumber(int n){
        for(int i = 1; i <= n; i++){
            sum += i ;
        }
        return sum;
    }
}
