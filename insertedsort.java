import java.util.*;
public class insertedsort {
    public static void insertedsort (int arr[]) {
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
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
            // assending order
       
                   // int temp = arr[smallest];
                   // arr[smallest] = arr[i];
                   // arr[i] = temp;
                
        }
        
       insertedsort(arr);
            //System.out.println(arr[i]);


        }
    }

