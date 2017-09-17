package C06MoreOnClasses;

public class OuterClass {
    
    private int[] workingdata;
    
    
    public OuterClass(int[] values)
    {
        workingdata = values;
    }
    
    public void analize(){
        InnerClass ic = new InnerClass();
        System.out.println("Max value is: "+ ic.Max());
        System.out.println("Min value is: "+ ic.Min());
    }


    class InnerClass{   //This is an inner nested class
        
        public int Max()
        {
            int result = workingdata[0];    //It has access to all the private data of its outer clas!!!
            for (int x=1; x< workingdata.length; x++)
                if (workingdata[x]>result)
                        result=workingdata[x];
            return result;
        }
        
        public int Min()
        {
            int result = workingdata[0];
            for (int x=1; x< workingdata.length; x++)
                if (workingdata[x]<result)
                        result=workingdata[x];
            return result;
        }
    }
}
