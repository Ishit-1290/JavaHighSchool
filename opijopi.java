import java.util.*;
public class opijopi {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your X");
        int x = kb.nextInt();
         float fact = 1; float total =0; //factorial and total
         System.out.print("Total =");
        for(int i = 2 ; i <= 20 ; i+= 2)
        {
            fact = 1;
            for(int j = 1  ; j <= i  ; j++)
            {
               fact = fact*j;
            }
            ;
            total  = total + (x/fact);
            System.out.print(x+ "/" + fact + " +");
        }
        System.out.println();
        System.out.println(total);
}
}
