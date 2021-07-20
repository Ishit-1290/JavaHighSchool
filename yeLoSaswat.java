public class yeLoSaswat {
    public static void main(String[] args) {
        int S = 1 ; int opt =0;
        
        for(int j = 1 ; j < 10 ; j++)
        {
            System.out.print("(");
            for(int i = 1 ,  factors = 1 ; i <= j-1 ; i++)
        {
            System.out.print(i + " x ");
            factors = factors*i;
            
         opt = factors;
        }
        opt=opt*j;
        System.out.print(j + ") + ");
        S = S + opt;
    }
    System.out.println();
            System.out.print("S = " +S);
        }
    }