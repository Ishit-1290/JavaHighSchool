import java.util.*;
public class magic {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       System.out.println("Enter the number");
       double num  = kb.nextInt(); double sum = 0;
       
       for(; num >= 0.0;)
       {
          sum= sum + (num%10.0);
          num = num/10;
          System.out.println(sum);
       }
       

       }

    }

