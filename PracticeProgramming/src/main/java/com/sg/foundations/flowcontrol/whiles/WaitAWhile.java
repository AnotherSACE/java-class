package com.sg.foundations.flowcontrol.whiles;

public class WaitAWhile {

    public static void main(String[] args) {

        int timeNow = 5; // Changing timeNow to 11 will cause it to never enter the while loop
        int bedTime = 10; // Changing bedTime to 11 will cause an extra loop to occur

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiittle longer....");
            timeNow++; // Time passes, commenting this out causes an infinite loop
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}
