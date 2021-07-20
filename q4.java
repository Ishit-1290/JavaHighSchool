import java.util.*;
public class q4 {
    public static void main(String[] args) {
        int n, num, r,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        n = sc.nextInt();
        num = n;
        for(;num>0;)
        {
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        if (n % sum == 0)
        {
            System.out.println("Niven Number");
        }
        else
        {
            System.out.println("Not Niven Number");
        }
    }
}
    

