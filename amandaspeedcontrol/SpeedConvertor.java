/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amandaspeedcontrol;

/**
 *
 * @author fordj
 */
public class SpeedConvertor {
    final double convertor = 0.6214;

    public SpeedConvertor() {
    }

    public double getConvertor(int KPH) {
        double New_Convertor = KPH * convertor; 
        return New_Convertor;
    }

   

    
    
    
}
