import java.util.*;
public class SumAproFactors {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println("Enter the number");
        int number = kb.nextInt();
        int sum = 0 , product = 1;
        System.out.println("Number is : "+ number);
        System.out.print("Factors of number : ");

        for(int i = 1 ; i <= number ; i++ )
        {
              if(number%i==0)
              {
              sum=sum+i;
              product = product*i;
              System.out.print(i + " ,");
              }
          }
          System.out.println();
          System.out.println("Sum of Factors: "+ sum);
          System.out.println("Product of Factors: "+ product);

        }

    }
    /*
    Number is : 10
Factors of number : 1 ,2 ,5 ,10 ,
Sum of Factors: 18
Product of Factors: 100 */

