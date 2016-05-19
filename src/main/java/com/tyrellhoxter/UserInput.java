package com.tyrellhoxter;

import java.util.Scanner;

/**
 * Created by tyrellhoxter on 5/19/16.
 */
public class UserInput extends SumOfNumbers {
    Scanner sc = new Scanner(System.in);

    public void askUser(String message){
        System.out.println(message);
    }

    public int intInput(String message){
        askUser(message);
        return sc.nextInt();
    }

    public int whatIsTheSum(){
        Sum1ToNumber(intInput("Please enter a number"));
        System.out.println("The sum of all of your numbers is " +sum);
        return sum;
    }
}
