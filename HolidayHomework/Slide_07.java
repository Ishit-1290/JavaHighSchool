import java.util.*;
public class Slide_07 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Res = 0;
        for(int i = 2; i<=n;i++){
            Res += (i*i)+1;
            if((i*i+1) == n){
                break;
            }
        }
        System.out.println(Res);
    }
}
