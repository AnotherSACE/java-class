package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {

    public static void main(String[] args) {

        String noun, adj, noun2, num, adj2, pnoun, pnoun2, pnoun3, verb, pastVerb;
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's play MAD LIBS!\n");

        System.out.print("I need a noun: ");
        noun = sc.nextLine();
        System.out.print("Now an adjective: ");
        adj = sc.nextLine();
        System.out.print("Another noun; ");
        noun2 = sc.nextLine();
        System.out.print("And a number: ");
        num = sc.nextLine();
        System.out.print("Another adjective: ");
        adj2 = sc.nextLine();
        System.out.print("A plural noun: ");
        pnoun = sc.nextLine();
        System.out.print("Another one: ");
        pnoun2 = sc.nextLine();
        System.out.print("One more: ");
        pnoun3 = sc.nextLine();
        System.out.print("A verb (infinitive form): ");
        verb = sc.nextLine();
        System.out.print("Same verb (past participle): ");
        pastVerb = sc.nextLine();

        System.out.println("***  NOW LETS GET MAD (libs) ***");
        System.out.println(noun + ": the " + adj + " frontier. These are the voyages of the starship " + noun2
        + ". Its " + num + "-year mission: to explore strange " + adj2 + " " + pnoun + ", to seek out " + adj2 + " "
        + pnoun2 + " and " + adj2 + " " + pnoun3 + ", to boldly " + verb + " where no one has " + pastVerb + " before.");
    }
}
