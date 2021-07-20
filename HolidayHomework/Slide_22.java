import java.util.*;
public class Slide_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int same = n;
        int rev = 0;
        while(same != 0){
            rev = rev*10 + same%10;
            same /= 10;
        }
        if(rev == n){
            System.out.println("It's a palindrome number.");
        } else{
            System.out.println("It's not a palindrome number.");
        }
    }
}
