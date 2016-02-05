package lab1a;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Kevin Soares 000374322
 * Date: 02/04/16
 * Purpose: To calculate the amount of change needed for 1 dollar and out the amount in the respective denominations.
 * Statement of Authorship: I, Kevin Soares, 000374322 certify that this material is my original work. No other person's work has been used without due acknowledgement.
 */
public class Lab1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables
        DecimalFormat df = new DecimalFormat("#.##");
        double purchasePrice;
        double changeAmount;
        int quaterCount = 0;
        int dimeAmount = 0;
        int nickleAmount = 0;
        int pennieAmount = 0;

        // Create object of type scanner
        Scanner input = new Scanner(System.in);

        // Print out and recieve input from the user
        System.out.print("Enter the price of the purchase in cents ($1 or less): ");
        purchasePrice = input.nextDouble();

        // Change and output the amount of change to the user
        changeAmount = 1.0 - (purchasePrice / 100);
        System.out.printf("Change: $%.2f \n", changeAmount);

        // While loops to count change // 
        while (changeAmount >= 0.25) {
            ++quaterCount;
            changeAmount -= 0.25;
            changeAmount = Double.valueOf(df.format(changeAmount));
        }
        
        while (changeAmount >= 0.10) {
            ++dimeAmount;
            changeAmount -= 0.10;
            changeAmount = Double.valueOf(df.format(changeAmount));
        }
        
        while (changeAmount >= 0.05) {
            ++nickleAmount;
            changeAmount -= 0.05;
            changeAmount = Double.valueOf(df.format(changeAmount));
        }

        while (changeAmount >= 0.01) {
            ++pennieAmount;
            changeAmount -= 0.01;
            changeAmount = Double.valueOf(df.format(changeAmount));
        }
        
        // Display outputs if needed
        DisplayOutput("Quaters", quaterCount);
        DisplayOutput("Dimes", dimeAmount);
        DisplayOutput("Nickles", nickleAmount);
        DisplayOutput("Pennies", pennieAmount);
    }
    
    /**
     * Display the current denomination count
     * @param denAmount The denomination amount outputted
     * @param changeAmount The current count of change to output
     */
    public static void DisplayOutput(String denAmount, int changeAmount)
    {
        if(changeAmount > 0)
        {
            System.out.printf("Number of %s: %d \n", denAmount, changeAmount);
        }
    }
}
