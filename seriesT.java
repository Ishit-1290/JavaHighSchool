/* Res = X2 - X4 + X6 - …… ± Xn */

import java.util.*;
public class seriesT {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       System.out.println("Input X");
       int X = kb.nextInt();
       System.out.println("Input power");
       int number = kb.nextInt();
       int Res = 0;
       for(int i = 2 , j = 2 ; i <= number ; i+=2 , j++)
       {
        if(j%2==0){
            Res = Res + ((int)Math.pow(X,i));
                    }
                    else{
                    Res = Res - ((int)Math.pow(X,i)); }
                 }
    System.out.print(Res);
}

}


