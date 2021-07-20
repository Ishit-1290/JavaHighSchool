import java.util.*;
public class factorsInSeprateLine
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       System.out.println("Input range");
       int min = kb.nextInt();
       int max = kb.nextInt();
       for(int i = min ; i < max ; i++)
       {
           System.out.print("Factos of "+i + " : ");
           for(int j = 1; j<= i ; j++)
         {          
             if(i%j==0)
             {
                 System.out.print(j + " ,");
             }
         }
         System.out.println();
       }
    }
}