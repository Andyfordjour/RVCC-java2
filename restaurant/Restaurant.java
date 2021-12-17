/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.Scanner;

/**
 *
 * @author fordj
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String vegi;
    String vegan;
    String gluten;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Is anyone in your party a vegetarian?");
    vegi = keyboard.nextLine();
    
    System.out.println("Is anyone in your party a vegan?");
    vegan = keyboard.nextLine();
    
    System.out.println("Is anyone in your party gluten-free?");
    gluten = keyboard.nextLine();
    
    System.out.println("Here are you restaurant selections: ");
    
    if (vegi.equalsIgnoreCase("no") && vegan.equalsIgnoreCase("no") && gluten.equalsIgnoreCase("no"))
    {
      System.out.println("Joe's Gourmet Burgers");
      System.out.println("Main Street Pizza Company");
      System.out.println("Corner Cafe");
      System.out.println("Mama's Fine Italian");
      System.out.println("The Chef's Kitchen");
    }
    else if (vegi.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("no") && gluten.equalsIgnoreCase("no"))
    {
      System.out.println("Main Street Pizza Company");
      System.out.println("Corner Cafe");
      System.out.println("Mama's Fine Italian");
      System.out.println("The Chef's Kitchen");
    }
    else if (vegi.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("yes") && gluten.equalsIgnoreCase("no"))
    {
      System.out.println("Corner Cafe");
      System.out.println("The Chef's Kitchen");
    }
    else if (vegi.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("yes") && gluten.equalsIgnoreCase("yes"))
    {
      System.out.println("Corner Cafe");
      System.out.println("The Chef's Kitchen");
    }
    else if (vegi.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("no") && gluten.equalsIgnoreCase("yes"))
    {
      System.out.println("Main Street Pizza Company");
      System.out.println("Corner Cafe");
      System.out.println("The Chef's Kitchen");
    }
    else if (vegi.equalsIgnoreCase("no") && vegan.equalsIgnoreCase("no") && gluten.equalsIgnoreCase("yes"))
    {
      System.out.println("Main Street Pizza Company");
      System.out.println("Corner Cafe");
      System.out.println("The Chef's Kitchen");
    }
    else if (vegi.equalsIgnoreCase("no") && vegan.equalsIgnoreCase("yes") && gluten.equalsIgnoreCase("no"))
    {
      System.out.println("Corner Cafe");
      System.out.println("The Chef's Kitchen");
    }
    else if (vegi.equalsIgnoreCase("no") && vegan.equalsIgnoreCase("yes") && gluten.equalsIgnoreCase("yes"))
    {
      System.out.println("Corner Cafe");
      System.out.println("The Chef's Kitchen");
    }
    else
    {
      System.out.println("Incorrect entry, enter either yes or no.");
    }
  }
          
}  
        
        
        /**
        Scanner keyboard = new Scanner(System.in);
        String vegetarian;
        String vegan ;
        String gluten_free;

        System.out.println("Is anyone in the party a vegetarian?");
        vegetarian = keyboard.nextLine();
        System.out.println("Is anyone in the party a vegan?");
        vegan = keyboard.nextLine();
        System.out.println("Is anyone in the party a gluten_free?");
        gluten_free = keyboard.nextLine();
        
        if(vegetarian=="no"&& vegan =="no" && gluten_free == "no" ){
            System.out.println("joe's Gourment Burger\n");
        }
                   
    
    **/
        
    

