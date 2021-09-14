import java.util.*;
public class Qany {
    public static void main(String[] args) {
        Scanner sc=   new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arrnew = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(i == 0){
                arrnew[i] = arr[i+1];
            } else if(i == n-1){
                arrnew[i] = arr[i-1];
            } else{
                arrnew[i] = arr[i-1] + arr[i+1];
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(arrnew[i]);
        }
    }
}
