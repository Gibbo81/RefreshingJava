package C06MoreOnClasses;

public class VarargsClass {
    
    public static void VarargsTest(int...p) //p is an array int[]!
    {
        System.out.println("Numbers of paramteres: " + p.length);
        if (p.length>0)
        {
            System.out.println("Parameters are:");
            for(int x : p)
                System.out.println(x); 
        }
    }
    //In mixed cases Varargs parameter must be last!!!
    public static void VarargsTestMixedArgument(double f, int k, int...p) //p is an array int[]!
    {
        System.out.println("f: " + f);
        System.out.println("k: " + k);
        System.out.println("Numbers of paramteres: " + p.length);
        if (p.length>0)
        {
            System.out.println("Parameters are:");
            for(int x : p)
                System.out.println(x); 
        }
    }
}
