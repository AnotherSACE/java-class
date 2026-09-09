package com.sg.foundations.scanner;

import java.util.Scanner;

public class PassingTheTuringTest {

    public static void main(String[] args) {

        String name;
        String color;
        String fruit;
        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("Hello there!");
        System.out.println("What's your name?");
        name = input.nextLine();

        System.out.println("Hi, " + name + "! I'm Alice");
        System.out.println("What's your favourite color? ");
        color = input.nextLine();

        System.out.println("Huh, " + color + "? Mine's electric Lime.");

        System.out.println("I really like limes. They're my favourite fruit, too.");
        System.out.println("What's YOUR favourite fruit " + name + "? ");
        fruit = input.nextLine();

        System.out.println("Really? " + fruit + "? That's wild!");
        System.out.println("Speaking of favourites, what's your favourite number? ");
        num = Integer.parseInt(input.nextLine());

        System.out.println(num + " is a cool number. Mine's -7.");
        System.out.println("Did you know " + num + " * -7 is " + (num * -7) + "? That's a cool number too!");
        System.out.println("\nWell, thanks for talking to me, " + name + "!");
    }
}
