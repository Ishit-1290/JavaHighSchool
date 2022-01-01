import java.util.*;
public class All_In_One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press A to print: ");
        System.out.println(1);
        System.out.println(12);
        System.out.println(123);
        System.out.println(1234);
        System.out.println(12345);

        System.out.println("\nPress B to print: ");
        System.out.println(5);
        System.out.println(54);
        System.out.println(543);
        System.out.println(5432);
        System.out.println(54321);

        System.out.println("\nPress C to print: ");
        System.out.println(12345);
        System.out.println(1234);
        System.out.println(123);
        System.out.println(12);
        System.out.println(1);

        char key = sc.next().charAt(0);
        switch (key) {
            case 'A':
                for(int i = 0; i < 5; i++){
                    for(int j = 0; j <= i; j++){
                        System.out.print(j+1);
                    }
                    System.out.println();
                }
                break;
            case 'B':
                for(int i = 5; i > 0; i--){
                    for(int j = 5; j >= i; j--){
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;
            case 'C':
                for(int i = 5; i > 0; i--){
                    for(int j = 1; j<=i; j++){
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;
            default:
                break;
        }
    }
}
