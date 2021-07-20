import java.util.*;
public class Slide_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int same = n;
        int sum = 0;
        while(same != 0){
            int factorial = 1;
            for(int i = 2; i <= same%10; i++){
                factorial *= i;
            }
            sum = sum + factorial;
            same /= 10;
        }
        if(sum == n){
            System.out.println("It's a special number");
        } else{
            System.out.println("It's not a special number.");
        }
    }
}
