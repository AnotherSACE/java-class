import java.util.Scanner;

public class Factorizer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean valid = false;
        int counter = 0;
        int perfect = 0;

        System.out.println("What number would you like to factor?");

        do {
            try {
                num = Integer.parseInt(sc.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
            }
        } while (!valid);

        System.out.println("The factors of " + num + " are:");

        // We can half the compute time by doing half the checks (since no factors exist after halfway through)
        for (int i = 1; i <= num/2; i++){
            if (num % i == 0){
                System.out.print(i + " ");
                counter++;
                perfect += i;
            }
        }

        // We must print the number itself as a factor as 1 and the number are counted here
        System.out.println(num);
        counter++;

        System.out.println(num + " has " + (counter) + " factors.");
        if (perfect == num) System.out.println(num + " is a perfect number");
        else System.out.println(num + " is not a perfect number");
        if (counter == 1) System.out.println(num + " is a prime number.");
        else System.out.println(num + " is not a prime number");
    }
}
