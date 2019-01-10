public class Practice
{
    
    
    public static void main(String[] args)
    {
        System.out.println("Hello Louis");
        
        NumberSequence ns = new NumberSequence();
        int[] returnedArray = ns.squareseq(0);
        for (int i=1; i< returnedArray.length; i++)
        {
            System.out.println(returnedArray[i]);
        }
        
        NumberSequence Ms = new NumberSequence();
        System.out.println(Ms.fibonacci(9));
        
        NumberSequence as = new NumberSequence();
        int[] returneddArray = as.cubeseq(5);
        for (int i=1; i< returneddArray.length; i++)
        {
            System.out.println(returneddArray[i]);
        }
        
        NumberSequence js = new NumberSequence();
        int[] returnedddArray = js.triangularnums(7);
        for (int i=1; i< returnedddArray.length; i++)
        {
            System.out.println(returneddArray[i]);
        }
        
    }
}