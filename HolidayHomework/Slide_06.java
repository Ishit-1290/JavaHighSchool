import java.util.*;
public class Slide_06 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = ob.nextInt();
        int Res = 0;
        for(int i = 0; i <n; i++){
            int temp = i+2;
            Res += (temp*temp)+1;
        }
        System.out.println(Res);
    }
}
