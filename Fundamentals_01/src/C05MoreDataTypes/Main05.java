package C05MoreDataTypes;

public class Main05 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        
        int[] n = CreateArray(100);
        for(int x : n)
            System.out.println("Element of value: " + x);
        
        System.out.println("--------------------------------------------------");
    }
    
    private static int[] CreateArray(int maxNumber)
    {
        int[] result = new int[maxNumber];
        for (int x=0; x<maxNumber; x++)
            result[x]=x;
        return result;
    }
}
