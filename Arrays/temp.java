import java.util.*;
public class temp{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = i; j < n-1; j++)
                System.out.print(" ");
            for(int j = i; j >= 0; j--)
                System.out.print(j + 1);
            System.out.println();
        }
        sc.close();        
    }
}
/*
1
12
123
1234
12345












*/