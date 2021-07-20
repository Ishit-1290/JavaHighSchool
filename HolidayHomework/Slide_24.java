import java.util.*;
public class Slide_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int same = n;
        int rev = 0;
        int count = 0;
        while(same != 0){
            rev = rev*10 + same%10;
            same /=10;
            count++;
        }
        same = n*n;
        int rev2 = 0;
        while(count > 0){
            count--;
            rev2 = rev2*10 + same%10;
            same /= 10;
        }
        if(rev == rev2){
            System.out.println("It's a magic number");
        } else{
            System.out.println("It's not a magic number");
        }
    }
}
