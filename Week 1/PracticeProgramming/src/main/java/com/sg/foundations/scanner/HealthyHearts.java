package com.sg.foundations.scanner;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {

        int max = 220;
        int age;
        float target1, target2;
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your age? ");
        age = Integer.parseInt(sc.nextLine());

        max -= age;
        target1 = max * 0.5f;
        target2 = max * 0.85f;

        System.out.println("Your maximum heart rate should be " + max + " beats per minute");
        System.out.println("Your target HR Zone is " + target1 + " - " + target2 + " beats per minute");

    }
}
