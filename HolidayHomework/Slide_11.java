import java.util.*;
public class Slide_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double Res = 0.0;
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for(int i = 2; i <= n; i+=2){
            int factorial = 1;
            for(int j = 2; j <= (i+1); j++){
                factorial *= j;
            }
            Res += (Math.pow(x, i) / factorial);
        }
        sc.close();
        System.out.println(Res);
    }
}
