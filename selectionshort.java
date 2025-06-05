import java.util.*;
public class selectionshort {
    public static void selection (int arr[]) {
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        int arr[] = {8,7,9,4};
        //int n = sc.nextInt();

        //  for (int i = 0; i <= size; i++) {
        //   System.out.println(arr[i]);
        //   }
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            // assending order
            //  for (int j = 0; j < (arr.length - 1 - i); j++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                    int temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;
                }
            }
        }
       selection(arr);
            //System.out.println(arr[i]);


        }
    }
