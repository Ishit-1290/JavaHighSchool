
public class evenFib {
    public static void main(String[] args) {
        int a = 0 ; int b = 1 ; int c = 0 ; int count = 0;
        for(int i = 1 ; true ; i++ )
        {
            c = a+b;
            a = b;
            b=c;
            if(c%2==0)
            {
                System.out.println(c  ); count = count+1;
            }
            if(count == 10){
           break; }
        }
    }
}
