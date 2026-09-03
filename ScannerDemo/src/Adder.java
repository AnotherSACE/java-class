import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {

        // declare sum and initialize it to 0
        int sum = 0;
        // declare and initialize our operands
        int operand1 = 0;
        int operand2 = 0;
        Scanner myScanner = new Scanner(System.in);

        String stringOperand1 = "";
        String stringOperand2 = "";

        boolean isValid = false;
        do {
            try {
                System.out.println("Please enter the first number to be added:");
                stringOperand1 = myScanner.nextLine();
                System.out.println("Please enter the second number to be added:");
                stringOperand2 = myScanner.nextLine();
                operand1 = Integer.parseInt(stringOperand1);
                operand2 = Integer.parseInt(stringOperand2);
                isValid = true;
            } catch (NumberFormatException ex) {
                System.out.println("Please enter valid numbers!");
            }
        } while (!isValid);




        //assign the sum of operand1 and operand2 to sum
        sum = operand1 + operand2;

        // NOTE: In the output below, the plus (+) operator
        // is acting as the string concatenation operator
        // instead of the addition operator.  In Java, we use
        // the plus (+) operator to concatentate (or glue together
        // string values.
        System.out.println("Sum is: " + sum);
    }

}
