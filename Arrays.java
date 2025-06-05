import java.util.*;
public class Arrays{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the size of the array");
          int n=sc.nextInt();
          int name []=new int[n];
     System.out.println("enter the elements");
          for(int i= 0;i<n;i++){
          name[i]=sc.nextInt();
          }
               System.out.println("enter the number you want to found");
               int x = sc.nextInt();
          for(int i =0;i < n;i++){
               if(x==name[i]){
          System.out.println("number found in index number is "+i);
          }
     }
          
     }
}
