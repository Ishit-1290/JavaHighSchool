public class Slide_19 {
    public static void main(String[] args) {
        for(int i = 8; i >= 2; i-=2){
            for(int j = i; j < 8; j+=2){
                System.out.print("  ");
            }
            for(int j = 2; j <= i; j+=2){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
