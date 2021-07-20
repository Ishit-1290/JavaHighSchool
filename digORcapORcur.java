import java.util.*;
public class digORcapORcur {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input your character");
        char c = kb.next().charAt(0);
        int n = (int)c;
        if(n>= 65 && n <= 90)
        {
        System.out.println("It is a cap");
        }
        else if(n>= 97 && n<= 122)
       {
        System.out.println("Its a small case letter");
        }
    else if(n>= 48 && n <= 57)
{
    System.out.println("Its a num");
}
    }
}


     
   
