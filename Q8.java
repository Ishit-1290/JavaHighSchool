import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner kb  = new Scanner(System.in);
        int c = 0; double sum = 0;
        for(;true;)
        {
        System.out.println("Enter number");
        int num=kb.nextInt();
        if(num<0)
        break;
        if(num%10==3)
        {
            sum=sum+num;
            c = c+1;
        }
        
        }
        double average = (sum/c);
        System.out.println("sum is "+sum);
        System.out.println("count is" +c);
        System.out.println("average is" + average);
    }
}
