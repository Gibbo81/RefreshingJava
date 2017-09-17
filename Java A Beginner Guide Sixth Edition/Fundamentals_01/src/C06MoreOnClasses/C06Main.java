package C06MoreOnClasses;
public class C06Main {

    public static void main(String[] args) {
        System.out.println("Working with static block");
        StaticBlock one = new StaticBlock("first");
        StaticBlock two = new StaticBlock("second");
        
        System.out.println("--------------------------------------------------");
        System.out.println("Declaring an inner class inside OuterClass");
        int[] n= {1,2,3,4,5,54,765,999};
        OuterClass oc= new OuterClass(n);
        oc.analize();
        System.out.println("--------------------------------------------------");
        System.out.println("It's possible to have methods with a run time variable number of parameters"); 
        System.out.println("It's caled Varargs!");
        VarargsClass.VarargsTest();
        VarargsClass.VarargsTest(1,5,99,432);
        VarargsClass.VarargsTest(1,9,4);
        VarargsClass.VarargsTest(32,5,76,12,0,4325,32,32,54,35,35,3);
        System.out.println("Varargs and fixed parameter can be mixed");
        VarargsClass.VarargsTestMixedArgument(1.5,3);
        VarargsClass.VarargsTestMixedArgument(1.8,5,4324,5436,65,4645,7645,6);
        System.out.println("--------------------------------------------------");
        
        MultipleConstructor mc = new MultipleConstructor(2,6,24.9873);
        System.out.println(mc);
    }
    
}
