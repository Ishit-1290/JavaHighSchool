import java.util.*;
public class Slide_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double Res = 0.0;
        System.out.println("Enter X: ");
        int X = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for(int i = 2; i <= n; i+=2){
            Res += Math.pow(X, i);
        }
        sc.close();
        System.out.println(Res);
    }
}
