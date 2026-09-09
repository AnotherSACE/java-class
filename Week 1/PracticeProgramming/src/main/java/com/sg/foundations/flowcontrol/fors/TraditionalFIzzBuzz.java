package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFIzzBuzz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;

        System.out.println("How many units of fizzing and buzzing do you need in your life? ");
        num = Integer.parseInt(sc.nextLine());

        for (int i = 0; count < num; i++) { // You can put any condition within the termination condition of the for loop
            if (i == 0) System.out.println(i);
            else if (i % 3 == 0) {
                count++;
                if (i % 5 == 0) System.out.println("fizz buzz");
                else System.out.println("fizz");
            } else if (i % 5 == 0) {
                count++;
                System.out.println("buzz");
            }
            else System.out.println(i);
        }
        System.out.println("TRADITION!!!!!");
    }
}
