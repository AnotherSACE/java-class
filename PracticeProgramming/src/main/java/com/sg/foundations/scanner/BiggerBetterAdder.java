package com.sg.foundations.scanner;

import java.util.Scanner;

public class BiggerBetterAdder {

    public static void main(String[] args) {

        int total;
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number 2: ");
        num2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number 3: ");
        num3 = Integer.parseInt(sc.nextLine());

        total = num1 + num2 + num3;

        System.out.println("Your total is: " + total);
    }
}
