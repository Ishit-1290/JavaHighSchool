import java.util.*;
public class Slide_08 {
    public static void main(String[] args) {
        int Res = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ab = 3;
        for(int i = 0, c= 2; i < n;i++){
            Res += c;
            c = c+ab;
            ab++;
        }
        sc.close();
        System.out.println(Res);
    }
}
