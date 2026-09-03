import java.util.Scanner;

public class WindowMaster {
    public static void main(String[] args) {

        // Declare strings to be parsed
        String stringHeight = "";
        String stringWidth = "";
        String stringWinCost = "";
        String stringTrimCost = "";


        // Declare input variables
        float height = 0;
        float width = 0;
        float winCost = 0;
        float trimCost = 0;


        // Declare output variables
        float area;
        float perimeter;
        float cost;

        // Create new scanner instance
        Scanner myScanner = new Scanner(System.in);

        // Get valid input from user
        boolean valid = false;
        do {
            try {
                System.out.println("Enter the Height:");
                stringHeight = myScanner.nextLine();
                System.out.println("Enter the Width");
                stringWidth = myScanner.nextLine();
                System.out.println("Enter the Trim price:");
                stringTrimCost = myScanner.nextLine();
                System.out.println("Enter the Window price:");
                stringWinCost = myScanner.nextLine();
                height = Float.parseFloat(stringHeight);
                width = Float.parseFloat(stringWidth);
                trimCost = Float.parseFloat(stringTrimCost);
                winCost = Float.parseFloat(stringWinCost);
                valid = true;
            } catch (NumberFormatException ex) {
                System.out.println("Please enter valid numbers!");
            }
        } while (!valid);

        // Calculate final output variables
        area = height * width;
        perimeter = 2*(height + width);
        cost = (winCost * area) + (trimCost * perimeter);

        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + area);
        System.out.println("Window perimeter = " + perimeter);
        System.out.println("Total Cost =  " + cost);

    }
}
