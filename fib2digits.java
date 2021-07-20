public class fib2digits{
    public static void main(String[] args) {
        int a = 0 ; int b = 1 ; int c = 0;
        for(;true;)
        {
            c = a + b;
            a = b;
            b=c;
            if(c>100)
            break;
            if(c/10>0)
            System.out.print(c + ",");
            
        }
    }
}
