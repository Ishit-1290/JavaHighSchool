public class q7b {
    public static void main(String[] args) {
        int sum = 0 , count = 0;
        for(int i = 1 ; true ; i+=2)
        {
          sum = sum + i;
          count = count + 1;
          if(count == 10)
          break;
        }
        System.out.println("sum =" + sum );
        
    }
}
