import java.util.*;
class series0{
    public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in);
       System.out.println("Input number of rows");
       int rows = kb.nextInt();
       for(int i = 0 ; i < rows ; i++)
       {
           for(int j = 0 ; j < rows ; j++)
           {
               System.out.print("* "); //* * * * * 
                                       //* * * * * 
           }
           System.out.println();
       }
    }
}
