public class series1 {
    public static void main(String[] args) {

        int i, j, r = 4;       
        for (i=0; i<r; i++)   
        {  
        //inner loop work for space      
        for (j=2*(r-i); j>=0; j--)         
        {  
        //prints space between two stars      
        System.out.print(" ");   
        }   
        //inner loop for columns  
        for (j=0; j<=i; j++ )   
        {   
        //prints star      
        System.out.print("* ");   
        }   
        //throws the cursor in a new line after printing each line  
        System.out.println();   
        }   
        }   
        }  