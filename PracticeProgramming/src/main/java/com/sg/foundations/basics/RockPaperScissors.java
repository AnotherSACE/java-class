package com.sg.foundations.basics;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        String userInput = "";
        String computer = "";
        boolean isValid = false;
        boolean playAgain = true;
        int userChoice = 0;
        int computerChoice = 0;
        int numRounds = 0;
        int wins = 0, losses = 0, ties = 0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissors! How many games do you want to play?");
        do {
            try {
                userInput = sc.nextLine();
                numRounds = Integer.parseInt(userInput);
                if (numRounds < 1 || numRounds > 10) throw new IllegalArgumentException("Invalid choice");
                isValid = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter a number between 1 and 10");
            }
        } while (!isValid);


        // Loop through the puzzle
        while (playAgain) {
            for (int i = 0; i < numRounds; i++) {

                // Ask user for their choice
                isValid = false; // Reset in case the user enters something wrong on the second loop
                System.out.println("Rock (1), Paper (2) or Scissors (3)?");

                // Make sure the user enters a valid number
                do {
                    try {
                        userInput = sc.nextLine();
                        userChoice = Integer.parseInt(userInput) - 1; // Format to match with computer result
                        if (userChoice < 0 || userChoice > 2) throw new NumberFormatException();
                        isValid = true;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Please enter a number between 1 and 3");
                    }
                } while (!isValid);


                // Generate a random choice between rock, paper and scissors
                computerChoice = rand.nextInt(3);
                switch (computerChoice) {
                    case 0:
                        System.out.println("Computer throws Rock");
                        break;
                    case 1:
                        System.out.println("Computer throws Paper");
                        break;
                    case 2:
                        System.out.println("Computer throws Scissors");
                        break;
                }


                // Check for a tie
                if (computerChoice == userChoice) {
                    ties++;
                    System.out.println("Tied");
                }
                // Check if the user wins
                else if (userChoice == 0 && computerChoice == 2 ||
                        userChoice == 1 && computerChoice == 0 ||
                        userChoice == 2 && computerChoice == 1) {
                    wins++;
                    System.out.println("You Win!");
                }

                // Otherwise, the user lost
                else {
                    losses++;
                    System.out.println("You Lose :(");
                }
            }

            // Prints the stats at the end of the game

            System.out.println("Wins: " + wins + " \nLosses: " + losses + "\nTies: " + ties);
            if (wins > losses) System.out.println("Congrats, you're the overall winner!");
            else if (wins < losses) System.out.println("Aww, better luck next time!");
            else System.out.println("Looks like we tied...");
            System.out.println("Want to play again? (y/n)");

            // Check if the user wants to play again
            isValid = false;
            while (!isValid) {
                try {
                    userInput = sc.nextLine();
                    switch (userInput) {
                        case "y":
                            isValid = true;
                            break;
                        case "n":
                            isValid = true;
                            playAgain = false;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid input");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Please enter either 'y' or 'n'");
                }
            }

            // Reset the wins and losses
            wins = 0; losses = 0; ties = 0;

        }

        // The user has decided not to continue playing
        System.out.println("Thanks for playing!");
    }
}
