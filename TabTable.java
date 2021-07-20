/*fix tabs */
import java.util.*; 
public class TabTable
    {
    public static void main(String[] args) 
        
    
        {
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter X");
            int X = kb.nextInt();
            System.out.println("Enter Y");
            int Y = kb.nextInt();
         int i=0,j=0;
         for(i=X;i<=Y;i++)  //outer loop
            {
             for(j=1;j<=10;j++)//inner loop
                System.out.println(i+" * "+j+" = "+i*j);
            }
        }
    }
class Tables_02
    {
    static void main(int X, int Y)
        {
         int i=0,j=0;
         for(i=1;i<=10;i++)  //outer loop
            {
             for(j=X;j<=Y;j++)//inner loop
                System.out.print(j+" * "+i+" = "+i*j+"\t");
             System.out.println();
            }
        }
    }