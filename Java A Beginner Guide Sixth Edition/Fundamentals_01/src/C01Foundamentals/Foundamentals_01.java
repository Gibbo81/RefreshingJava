package C01Foundamentals;

public class Foundamentals_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Java rule");
        
        int var1 = 1024;
        int var2 = var1/2;
        System.out.println("var1 contains: "+var1);
        System.out.print("var2 contains var1/2: ");
        System.out.println(var2);
        
        int var3=30, var4=100;
        
        Gallons g = new Gallons(10);
        System.out.println("There are "+g.Gallons+" gallons equals to "+g.Liters+" liters");
        
        for(int x=0; x<6; x++)
        {
            System.out.println("count " +x);
        }
        
        Gallons.PrintConversionTable(var3, var4);
    }
    
}
