public class Slide_18 {
    public static void main(String[] args) {
        for(int i = 4, c = 1; i > 0; i--, c+=2){
            for(int j=0; j < i; j++)
                System.out.print("  ");
            for(int j = c; j>=1; j-=2)
                System.out.print(j + " "); 
            System.out.println();
        }
        
    }
}
