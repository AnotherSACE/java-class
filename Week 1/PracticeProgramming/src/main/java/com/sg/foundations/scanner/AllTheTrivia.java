package com.sg.foundations.scanner;

import java.util.Scanner;

public class AllTheTrivia {

    public static void main(String[] args) {

        String ans1, ans2, ans3, ans4;
        Scanner sc = new Scanner(System.in);

        System.out.println("What unit is equivalent to 1,024 Gigabytes? ");
        ans1 = sc.nextLine();

        System.out.println("Which planet is the only one that rotates clockwise in our Solar System? ");
        ans2 = sc.nextLine();

        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet? ");
        ans3 = sc.nextLine();

        System.out.println("What is the most abundant element in the earth's atmosphere? ");
        ans4 = sc.nextLine();

        System.out.println("Wow, 1,024 Gigabytes is a " + ans3 + "!");
        System.out.println("I didn;t know that the largest ever volcano was discovered on " + ans1 + "!");
        System.out.println("That's amazing that " + ans2 + " is the mist abundant element in the atmosphere...");
        System.out.println(ans4 + " is the only planet that rotates clockwise, neat!");

    }
}
