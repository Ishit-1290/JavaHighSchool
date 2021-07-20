import java.util.*;
public class neonNum
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number");

         int number = kb.nextInt();   int sq = number*number;
         int sum = 0;
       
       for(; sq>0 ;)
       {
           
           sum = sum + sq%10;
           sq = sq/10;
       }
      
       if(sum==number)
       {
           System.out.println(number + " is neon");
       }
       else
       System.out.println("Not neon");
    }
}



