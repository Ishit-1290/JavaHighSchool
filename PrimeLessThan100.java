public class PrimeLessThan100 {
    public static void main(String[] args) {
        for( int i = 10 ; i <=100 ; i++ )
        {
            boolean yes = true;
            for ( int d = 2 ; d < i; d++)
            {
            if(i%d==0)
            {
            yes = false; }
            }
            if(yes)
            System.out.print(i + " ");
        }
    }
}
