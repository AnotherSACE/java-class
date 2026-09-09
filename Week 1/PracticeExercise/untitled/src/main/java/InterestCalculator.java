import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float currentBalance = 0;
        float quarterlyInterestRate = 0;
        int years = 0;
        boolean valid = false;
        float earned = 0;

        do {
            try {
                System.out.print("How much do you want to invest? ");
                currentBalance = Float.parseFloat(sc.nextLine());
                System.out.print("How many years are investing? ");
                years =Integer.parseInt(sc.nextLine());
                System.out.print("What is the annual interest rate % growth? ");
                quarterlyInterestRate = Float.parseFloat(sc.nextLine()) / 4;
                valid = true;
            } catch (NumberFormatException e){
                System.out.println("Please enter valid numbers!");
            }
        } while (!valid);

        System.out.println("Calculating...");
        for (int i = 1; i <= years; i++) {

            System.out.println("Year " + i + ":");
            System.out.println("Began with $" + currentBalance);
            earned = currentBalance;
            for (int j = 0; j < 4; j++)
                earned *= (1 + (quarterlyInterestRate / 100));
            earned -= currentBalance;
            System.out.println("Earned: $" + earned);
            currentBalance += earned;
            System.out.println("Ended with $" + currentBalance);
        }
    }
}
