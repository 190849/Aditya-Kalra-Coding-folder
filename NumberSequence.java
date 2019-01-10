

public class NumberSequence
{
    
    
    public int[] squareseq(int n)
    {
        int[] numArray = new int[n];
        for (int i=1; i<=n; i++)
        {
            numArray[i-1]=i*i;
        }
        return numArray;
        
    }
    
    
    public int fibonacci(int n)  
   {
    if(n == 0)
        return 0;
    else if(n == 1)
      return 1;
   else
      return fibonacci(n - 1) + fibonacci(n - 2);
   }
    
     public int[] cubeseq(int n)
    {
        int[] numberArray = new int[n];
        for (int i=1; i<=n; i++)
        {
            numberArray[i-1]=i*i*i;
        }
        return numberArray;
        
    }
    
    public int[] triangularnums(int a)
    {
        int[] numberrArray = new int[a];
        for (int i = 1 ; i < 10 ; i++) {
        int n = i*(i+1)/2;
        System.out.println( "n:" + i +" triangle number:"+n );
        }
        return numberrArray; 
        
        
        
    }

   
}
