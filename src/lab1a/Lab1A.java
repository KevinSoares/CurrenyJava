/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1a;

import java.util.Scanner;

/**
 *
 * @author kevin.soares1
 */
public class Lab1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variables
        double purchasePrice;
        double changeAmount;
        int quaterCount = 0;
        int dimeAmount = 0;
        int nickleAmount = 0;
        int pennieAmount = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the price of the purchase in cents ($1 or less): ");
        purchasePrice = input.nextDouble();
        
        changeAmount = 1.0 - (purchasePrice / 100);
        System.out.printf("Change: %f \n", changeAmount);
        
        while(changeAmount >= 0.25)
        {
            ++quaterCount;
            changeAmount -= 0.25;
        }
        
        System.out.printf("Quaters: %d \n", quaterCount);
        System.out.printf("Change: %f \n", changeAmount);
        
        while(changeAmount >= 0.10)
        {
            ++dimeAmount;
            changeAmount -= 0.10;
        }
        
        System.out.printf("Dimes: %d \n", dimeAmount);
        System.out.printf("Change: %f \n", changeAmount);
        
        while(changeAmount >= 0.05)
        {
            ++nickleAmount;
            changeAmount -= 0.05;
        }
        
        System.out.printf("Nickles: %d \n", nickleAmount);
        System.out.printf("Change: %f \n", changeAmount);
        
        while(changeAmount >= 0.01)
        {
            ++pennieAmount;
            changeAmount -= 0.01;
        }
        
        System.out.printf("Pennies: %d \n", pennieAmount);
        System.out.printf("Change: %f \n", changeAmount);
    }
}