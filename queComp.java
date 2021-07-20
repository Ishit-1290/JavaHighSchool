import java.util.Scanner;
public class queComp
{
    public static void main ( String[] args )
    {
        Scanner kb  = new Scanner(System.in);
        System.out.println("Choose the type of booking!");
        System.out.println("Enter 1 for Ordinary booking");
        System.out.println("Enter 2 for Express booking");
        int choice = kb.nextInt();
        System.out.println("Enter weight of the parcEL(in grams)");
        double load = kb.nextDouble(); //load = weight
        int charge = 0;
        
        if(choice == 1)
        {
            if(load <= 100)
                { charge = 80; }
                else if(load>100 &&  load < 500)
                { charge = 150; }
                else if(load>500)
                { charge=210; }
            }
            else if(choice == 2)
            {
                 if(load <= 100)
                { charge = 100; }
                else if(load>100 &&  load < 500)
                { charge = 200; }
                else if(load>500)
                { charge=300; } }
                System.out.println("Item weight: "+load);
                System.out.println("Charges: "+charge);
            }
        }
        
        
            
        