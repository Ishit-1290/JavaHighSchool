public class prime2digit { //in descending order
    public static void main(String[] args)
    {
        for(double i = 100.0 ; true ; i--)
        {
            int count =0; 
            for(int j = 1 ; j<=i ; j++)
            {
             if((i/10)>1.0 && (i/10)<10.0)
             {
                if(i%j==0)
                count=count+1;
            }
        }
            if(count == 2){
            System.out.println(i); }
            if(i<1.0)
            break;
        }
    }
}
