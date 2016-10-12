/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroducingDataTypesandOperators_02;

import Foundamentals_01.Gallons; 


/**
 *
 * @author cpsistemi
 */
public class Main {
    public static void main(String[] args) 
    {
        Gallons p= new Gallons(1);
        double z = p.Liters;
        
        Char(70);
        
        LightningSound ls = new LightningSound();
        double distance = ls.Distance(7.2);
        System.out.println("The lightinig strike at "+ distance + " feets");
        
        int k = 535_45_4;       //Its' the same of 535454
        String i= "sdas";
    }
    
    
    public static void Char(int n)
    {
        char c= 'n';
        System.out.println("C values: "+ c);
        c= (char)n;
        System.out.println("C values: "+ c);
        c++;
        System.out.println("C values: "+ c);
        
    }
}
