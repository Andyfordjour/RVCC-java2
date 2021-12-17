package demonov16foodcheese;

/**
 * demo of Inheritance in Ch 09
 * @author Stephen T. Brower
 */
public class DemoNov16FoodCheese {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test Food class
        // next line works when no constructor is provided
        // Food myFood = new Food();
        
        // instantiate using parameters
        Food myFood = new Food("Apple", 20);
        
        System.out.println("My Food: " + myFood );
        
        System.out.println("\ninitially\nFood desc: " + myFood.getDescription() +
                " cal: " + myFood.getCalories());
        
        myFood.setDescription("Gala Apple");
        myFood.setCalories(45);

        System.out.println("\nafter update\nFood desc: " + myFood.getDescription() +
                " cal: " + myFood.getCalories());
        
        System.out.println("\n\nCheese Section\n");
        // test Cheese class
        // next line works when no constructor is provided
        //Cheese myCheese = new Cheese();\
        
        // instantiate using parameters
        Cheese myCheese = new Cheese("Cheddar",100,1);
        
        System.out.println("My Cheese: " + myCheese);
        
        System.out.println("\ninitially\nCheese desc: " + myCheese.getDescription() +
                " cal: " + myCheese.getCalories() +
                " months: " + myCheese.getMonthsAged());
        
        myCheese.setDescription("Manchego");
        myCheese.setCalories(200);
        myCheese.setMonthsAged(6);
        
        System.out.println("\nAfter\nCheese desc: " + myCheese.getDescription() +
                " cal: " + myCheese.getCalories() +
                " months: " + myCheese.getMonthsAged());
    }
    
}
