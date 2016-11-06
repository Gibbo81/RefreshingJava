package C05MoreDataTypes;

public class Main05 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        
        int[] n = CreateArray(100);
        for(int x : n)
            System.out.println("Element of value: " + x);
        
        System.out.println("--------------------------------------------------");
        System.out.println("Irregular/Rugged Array");
        System.out.println("In java multidimensional array are created as array of array");
        int nums[] = {1,6,3};
        int[][] raggedarray = CrateIrregularArray(3, nums);
        for (int x=0; x<raggedarray.length; x++)
            for (int k=0; k<raggedarray[x].length; k++)
                System.out.println("Rugged Array position ["+x+"]["+k+"] values: " + raggedarray[x][k]);
        System.out.println("Rugged Array --> raggedarray.length: "+raggedarray.length + "It's the lenght of the array of array");
        for (int x=0; x<3; x++)
            System.out.println("raggedarray[x].length: "+raggedarray[x].length + " It's the lenght of the array number "+x);
    
        System.out.println("--------------------------------------------------");
        System.out.println("Work with self made queue");
        Queue q= new Queue(4);
        q.Insert(10);
        q.Insert(9);
        q.Insert(4);
        q.Insert(5);
        q.Insert(50);
        System.out.println("q.Read(): " + q.Read());
        System.out.println("q.Read(): " + q.Read());
        System.out.println("q.Read(): " + q.Read());
        System.out.println("q.Read(): " + q.Read());
        System.out.println("q.Read(): " + q.Read());
        System.out.println("q.Read(): " + q.Read());
        System.out.println("q.Read(): " + q.Read());
        System.out.println("q.Read(): " + q.Read());
        System.out.println("--------------------------------------------------");
        System.out.println("for Each");
        int[] array = {1,2,3,6,12};
        int result=0;
        for (int y : array)
            result= result + y;
        System.out.println("Result: "+ result);        
        System.out.println("--------------------------------------------------");
        PrintCommandLineArguments(args);
        System.out.println("--------------------------------------------------");
        
        System.out.println("AbsluteValueTernaryOperator(-23): "+AbsluteValueTernaryOperator(-23));
        System.out.println("AbsluteValueTernaryOperator(5433): "+AbsluteValueTernaryOperator(5433));
        System.out.println("AbsluteValueTernaryOperator(539): "+AbsluteValueTernaryOperator(539));
        System.out.println("AbsluteValueTernaryOperator(-4432): "+AbsluteValueTernaryOperator(-4432));
        System.out.println("--------------------------------------------------");
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("--------------------------------------------------");
    }
    
    private static int[] CreateArray(int maxNumber)
    {
        int[] result = new int[maxNumber];
        for (int x=0; x<maxNumber; x++)
            result[x]=x;
        return result;
    }
    
    private static int[][] CrateIrregularArray(int leng1, int[] lengs2)//ragged array
    {
        int[][] result = new int[leng1][];
        for (int n=0; n<leng1; n++)
        {
            result[n]= new int[lengs2[n]];
            for (int k=0; k<lengs2[n]; k++)
                result[n][k]=n+k;
        }
        return result;
    }
    
    private static void PrintCommandLineArguments(String[] args)
    {
        int count=0;
        System.out.println("There are "+args.length + " arguments");
        for(String s : args)
            System.out.println("Argument " + count++ + " is " + s);
    }
    
    private static int AbsluteValueTernaryOperator(int x)
    {
        return x>0 ? x : -x;
    }
}
