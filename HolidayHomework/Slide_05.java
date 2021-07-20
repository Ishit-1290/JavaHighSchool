import java.util.*;
public class Slide_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int X = sc.nextInt();
        System.out.println("Enter the second number: ");
        int Y = sc.nextInt();
        int min = Math.min(X, Y);
        int max = Math.max(X, Y);
        for(;min <= max; min++){
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(min); i++){
                if(min%i == 0){
                    isPrime = false;
                }
            }
            if(isPrime)
                System.out.println(min);
        }
        sc.close();
    }
}
