import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int size = sc.nextInt();
        int arr[] = {8,7,9,4};
        //int n = sc.nextInt();

      //  for (int i = 0; i <= size; i++) {
         //   System.out.println(arr[i]);
     //   }
        for (int i = 0; i < arr.length; i++) {
            // assending order
            //  for (int j = 0; j < (arr.length - 1 - i); j++) {
            for (int j=0;j<arr.length-1;j++){
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
               // System.out.println(arr[j]);
            }
                System.out.println(arr[i]);


        }
    }
}