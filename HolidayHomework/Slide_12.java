import java.util.*;
public class Slide_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int Res = 2+3;
        int ab = 4;
        for(;ab <= n;){
            Res = Res+Res+ab;
            ab++;
        }
        System.out.println(Res);
    }
}
