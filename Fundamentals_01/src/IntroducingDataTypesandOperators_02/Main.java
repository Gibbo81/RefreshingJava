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
        
        System.out.println("cilinder volume is: " +Volume(10,30));
        
        ShortCircuit();
        
        byte a=10;
        byte b;

        b=(byte)(a+a);  //Bte operatio return an int, if you want you must cast it back
    }
    
    public static double Volume(double radius, double height)
    {
        return 3.1416 *(radius*radius) *height;        
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
    
    public static void ShortCircuit()
    {
        System.out.println("| and & will always elaborete both side");
        System.out.println("|| and && will elaborete left side only if necessary");
        System.out.println("put a break point and see :-)");
        
        System.out.println(ReturnTrue()|ReturnFalse()); //bOTH
        System.out.println(ReturnTrue()||ReturnFalse());//ONLY LEFT
        System.out.println(ReturnFalse()&ReturnTrue());//bOTH
        System.out.println(ReturnFalse()&&ReturnTrue());//ONLY LEFT
    }
    
    public static boolean ReturnTrue()
    {
        return true;
    }
    public static boolean ReturnFalse()
    {
        return false;
    }
}