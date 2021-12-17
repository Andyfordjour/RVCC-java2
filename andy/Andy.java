/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andy;

import java.util.Scanner;

/**
 *
 * @author fordj
 */
public class Andy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double temperature_max = 102.5;
        double temperature_sub;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the temperature of the Substance ");
        temperature_sub = keyboard.nextDouble();
        while (temperature_sub >= temperature_max) {
            System.out.println("Turn down the vat's thermostate");
            System.out.println("Wait for 5 minutes");
            System.out.println("Check the temperature again");
            System.out.println("Enter it here");
            temperature_sub = keyboard.nextDouble();
        }
        System.out.println("Temperature is accepted ");
        System.out.println("check it again in 15 minutes");

    }

}
