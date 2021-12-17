/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amandaspeedcontrol;

//import java.util.Scanner;

/**
 *
 * @author fordj
 */
public class AmandaSpeedControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int KPH;
        double MPH;
        //Scanner keyboard = new Scanner(System.in);
        SpeedConvertor convertor = new SpeedConvertor();
        System.out.println("KPH      MPH");
        System.out.println("**************");
        for (KPH = 60; KPH <= 130; KPH += 10) {
            MPH = convertor.getConvertor(KPH);
            System.out.printf("%d\t\t%.1f\n", KPH, MPH);
        }
    }

}
