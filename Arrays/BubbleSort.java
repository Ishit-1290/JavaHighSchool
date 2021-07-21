import java.util.*;
public class  BubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        arr = bubbleSort(arr, n);
        sc.close();
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] bubbleSort(int[] arr, int n){
        for(int i = 0; i < n-1; i++){
            boolean flag = false;
            for(int j = 0; j < n-1; j++){
                if(arr[j] > arr[j+1]){
                    flag = true;
                    int c = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = c;
                }
            }
            if(!flag){
                break;
            }
        }
        return arr;
    }
}