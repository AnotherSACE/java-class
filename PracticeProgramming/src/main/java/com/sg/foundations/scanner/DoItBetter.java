package com.sg.foundations.scanner;

import java.util.Scanner;

public class DoItBetter {

    public static void main(String[] args) {

        int ans1, ans2, ans3;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many miles can you run? ");
        ans1 = Integer.parseInt(sc.nextLine());
        System.out.println("Well... I can do " + (ans1 * 2 + 1) + " miles");

        System.out.println("How many hot dogs can you eat? ");
        ans2 = Integer.parseInt(sc.nextLine());
        System.out.println("That's cool but I can eat " + (ans2 * 2 + 1) + "!");

        System.out.println("How about number of languages? ");
        ans3 = Integer.parseInt(sc.nextLine());
        System.out.println("Yeah... I know " + (ans3 * 2 + 1));
    }
}
