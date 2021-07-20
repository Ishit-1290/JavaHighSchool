import java.util.*;
public class next5Prime {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println("Enter the number");
        int num = kb.nextInt();  int ext=0; int num2 = num+1;
        for(int i = num2 ; true ; i++)
        {
            
            int count = 0;
            for(int j = 1 ; j <= i ; j++)
            {
               
                if(i%j==0)
                {
                    count=count+1;
                }
                
            }
            if(count==2)
                {
                    System.out.println(i+" is prime");
                    ext = ext+1;
                }
            if(ext==5)
            {
            break;}
        }
    }
}
