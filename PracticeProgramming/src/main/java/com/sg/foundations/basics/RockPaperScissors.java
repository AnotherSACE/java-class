package com.sg.foundations.basics;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        String userInput = "";
        String computer = "";
        boolean isValid = false;
        boolean tryAgain = true;
        int choice = 0;
        int wins = 0, losses = 0, ties = 0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // Loop through the puzzle
        while (tryAgain){

            // Ask user for their choice
            isValid = false; // Reset in case the user enters something wrong on the second loop
            do {
                try {
                    System.out.println("Rock, Paper or Scissors?");
                    userInput = sc.nextLine();
                    if (!(userInput.equals("rock") ||
                            userInput.equals("paper") ||
                            userInput.equals("scissors")))
                        throw new IllegalArgumentException("Invalid input");
                    isValid = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Please enter either 'rock' 'paper' or 'scissors'");
                }
                } while (!isValid);

            // Generate a random choice between rock, paper and scissors
            choice = rand.nextInt(3);
            switch (choice) {
                case 0:
                    computer = "rock";
                    System.out.println("Computer throws Rock");
                    break;
                case 1:
                    computer = "paper";
                    System.out.println("Computer throws Paper");
                    break;
                case 2:
                    computer = "scissors";
                    System.out.println("Computer throws Scissors");
                    break;
            }


            // Check for a tie
            if (computer.equals(userInput)) {
                ties++;
                System.out.println("Tie, try again? (Y/N)");
            }
            // Check if the user wins
            else if (userInput.equals("rock") && computer.equals("scissors") ||
                        userInput.equals("paper") && computer.equals("rock") ||
                        userInput.equals("scissors") && computer.equals("paper")) {
                wins++;
                System.out.println("You Win! Play again? (Y/N)");
            }

            // Otherwise, the user lost
            else {
                losses++;
                System.out.println("You Lose :( Play again? (Y/N)");
            }

            // Now check if the user wants to play again
            isValid = false;
            while (!isValid){
                try {
                    userInput = sc.nextLine();
                    switch (userInput) {
                        case "y":
                            isValid = true;
                            break;
                        case "n":
                            isValid = true;
                            tryAgain = false;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid input");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Please enter either 'y' or 'n'");
                }
            }
        }
        // Prints the wins at the end of the game
        System.out.println("Wins: " + wins + " \nLosses: " + losses + "\nTies: " + ties);
        if (wins > losses) System.out.println("Congrats, you're the overall winner!");
        else if (wins < losses) System.out.println("Aww, better luck next time!");
        else System.out.println("Looks like we tied...");
        System.out.println("Thanks for playing!");
    }
}
