import java.util.*;
public class rightTria {
    public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in);
       System.out.println("Input number of rows");
       int rows = kb.nextInt();
      for(int i = 1 ; i <= rows ; i++)
      {
          for(int j = i ; j <= rows ; j++)
          {
              System.out.print(" ");
          }
          for(int j = 1 ; j <= i ; j++)
          {
            System.out.print("*");
          }
          System.out.println();
      }
    }

}
/*
      *
     **
    ***
   ****
  *****
 ******
  */