import java.util.*;
public class testFile {
    public static void main (String[] args)
    {
       Scanner kb = new Scanner(System.in);
       System.out.println("Input your number");
       int num = kb.nextInt();
       
          int sum = 0 ; int product = 1; System.out.print("Factors:  ");
       for(int i = 1 ; i <= num ; i++)
       {
           if(num%i==0)
           {
               System.out.print(i + " ,"); 
               sum = sum + i ;
               product = product*i;
           }
       }
       System.out.println();
       System.out.println("Sum of factors :  " + sum);
       System.out.println("Product of factors : " + product);
}
}