/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author fordj
 */
public class Files {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        String fileName;
        Scanner keyboard = new Scanner(System.in);  
        
        System.out.println("enter file name: ");
        fileName = keyboard.nextLine();
        //open file
        File andy = new File(fileName);
        //read file
        try (Scanner inputFile = new Scanner(andy)) {
            //read file
            String line = inputFile.nextLine();
            
            System.out.println(line);
        }catch(Exception e){
            System.out.println("try again");
        }
        
    }
    
}
