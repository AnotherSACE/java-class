import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float currentBalance = 0;
        float interestRate = 0;
        int years = 0;
        boolean valid = false;
        float earned = 0;
        int type = 0;

        do {
            try {
                System.out.print("How much do you want to invest? ");
                currentBalance = Float.parseFloat(sc.nextLine());
                System.out.print("How many years are investing? ");
                years =Integer.parseInt(sc.nextLine());
                System.out.print("What is the annual interest rate % growth? ");
                interestRate = Float.parseFloat(sc.nextLine());
                System.out.println("Is interest added: daily (1), weekly (2), monthly (3), quarterly (4), or yearly (5)");
                type = Integer.parseInt(sc.nextLine());
                switch (type) {
                    case (1):
                        System.out.println("You have selected daily compound interest");
                        type = 365; // Could be 365.25, but I decided to make things simpler
                        break;
                    case (2):
                        System.out.println("You have selected weekly compound interest");
                        type = 51;
                        break;
                    case (3):
                        System.out.println("You have selected monthly compound interest");
                        type = 12;
                        break;
                    case (4):
                        System.out.println("You have selected quarterly compound interest");
                        break;
                    case (5):
                        System.out.println("You have selected annual compound interest");
                        type = 1;
                        break;
                    default:
                        throw new NumberFormatException();
                }
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
            for (int j = 0; j < type; j++)
                earned *= (1 + ((interestRate/type) / 100));
            earned -= currentBalance;
            System.out.println("Earned: $" + earned);
            currentBalance += earned;
            System.out.println("Ended with $" + currentBalance);
        }
    }
}
