package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(201) - 100;
        int guess;
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        do {
            guess = Integer.parseInt(sc.nextLine());
            System.out.println("Your guess: " + guess);
            if (guess < num) {
                System.out.println("Ha, nice try - too low! Try again!");
            } else if (guess > num) {
                System.out.println("Too bad, way too high. Try again!");
            } else System.out.print("Wow, nice guess! That was it!");
        } while (guess != num);
    }
}
