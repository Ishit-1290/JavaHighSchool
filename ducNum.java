import java.util.*;
class ducNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String ab = sc.next();
        boolean duck = false;
        for(int i = 0; i < ab.length(); i++) {
            if(ab.charAt(0) == '0') {
                duck = false;
                break;
            }
            else if(ab.charAt(i) == '0'){
                duck = true;
                break;
            }
        }
        if(duck) {
            System.out.println("It's a duck number.");
        } else{
            System.out.println("It's not a duck number.");
        }
        sc.close();
    }
}