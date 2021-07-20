import java.util.*;


public class factorialInOrder
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       System.out.println("Enter the number");
       int num = kb.nextInt();
       for(int i = 1 ; i <= num ; i++)
   {
    int sum = 1;
    System.out.print(i + "!" + "(");
       for(int j = 1 ; j< i ; j++)
       {
           sum = sum*j;
           System.out.print(j + "*" );
       }
       System.out.print( + i +")" +"=" + sum);
       System.out.println();
   }
}

}