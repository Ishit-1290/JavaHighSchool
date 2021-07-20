import java.util.Scanner;


public class lastQ {
    public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
           System.out.println("Input Cost of Car");
           double cost = kb.nextDouble();
           System.out.println("Enter Type of car, D= Diesal and P=Petrol");
           char type = kb.next().charAt(0);
           double d = 0; double net = 0;
           if(type=='D')
           {
               if(cost<60000){
                   d=0.0;
               }
               else if(cost>60000&&cost<100000){
               d=5.0;
               }
               else if(cost>100000&&cost<150000){
                   d=7.5;}
               else if(cost>150000)
                   {
                    d=10.0;
                   }
                }
                else if(type=='P')
                {
                    if(cost<60000){
                        d=5.0;
                    }
                    else if(cost>60000&&cost<100000){
                    d=7.6;
                    }
                    else if(cost>100000&&cost<150000){
                        d=10.0;}
                    else if(cost>150000)
                        {
                         d=15.0;
                        }
                     }
                     double discount = (d/100)*cost;
                     net = cost - discount;
                     System.out.println("net amt :"+net);




           }
            }

