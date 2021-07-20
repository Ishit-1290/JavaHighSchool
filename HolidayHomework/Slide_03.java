/**
 * Slide_03
 */
public class Slide_03 {
    public static void main(String[] args) {
        int a =-1;
        int b = 1;
        int c = 0;
        for(int i = 0; i < 10; i++){
            c = a+b;
            System.out.println(c);
            int temp = b;
            b = c;
            a = temp;
        }
    }    
}