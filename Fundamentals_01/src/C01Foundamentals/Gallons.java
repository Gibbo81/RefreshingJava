/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C01Foundamentals;

/**
 *
 * @author cpsistemi
 */
public class Gallons {
    public double Liters;
    public double Gallons;
    
    public Gallons(double gal)
    {
        Gallons = gal;
        Liters = Gallons*3.785;
    }
    
    public static void PrintConversionTable(int starting, int ending)
    {
        int count=1;
        for (int x=starting; x<ending; x++, count++)
        {
            System.out.println("Gallons "+x+" are "+x*3.785+" liters");
            if ((count%10)==0)
                System.out.println();
        }
    }
}
