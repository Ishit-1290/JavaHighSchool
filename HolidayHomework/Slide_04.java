public class Slide_04 {
    public static void main(String[] args) {
        int a =-1;
        int b = 1;
        int c = 0;
        for(;true;){
            c = a+b;
            if(c >= 10 && c < 100)
                System.out.println(c);
            else if(c > 99)
                break;
            
            int temp = b;
            b = c;
            a = temp;
        }
    }
}
