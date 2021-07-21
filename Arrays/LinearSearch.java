import java.util.*;
public class  LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value for searching in the array: ");
        int FIND = sc.nextInt();
        boolean found = false;
        int i = 0;
        for(i = 0; i < n; i++){
            if(arr[i] == FIND){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Value found at " + (i+1) + " element of the array");
        } else{
            System.out.println("Value was not found in array");
        }
        sc.close();
        
    }
}