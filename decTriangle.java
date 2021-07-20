import java.util.*;
class decTriangle{
    public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in);
       System.out.println("Input number of rows");
       int rows = kb.nextInt();
       for(int i = rows ; i > 0  ; i--)
       {
           for(int j = 0 ; j < i ; j++)
           {
               System.out.print("* "); 
           }
           System.out.println();
       }
    }
}
/*
*****
***
**
* 
*/