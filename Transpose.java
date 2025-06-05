import java.util.*;
public class Transpose {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the size of the array");
          int r=sc.nextInt();
          int c=sc.nextInt();
          int matrix [][]=new int[r][c];
   //  System.out.println("enter the elements");
          for(int i= 0;i<r;i++){
               for(int j= 0;j<c;j++){
           System.out.println("enter the elements( "+ (i+1) +"," + (j+1) +")");
        matrix[i][j]=sc.nextInt();
          }
     }
     System.out.println("actual matrix");
          for(int i= 0;i<r;i++){
              for(int j= 0;j<c;j++){
                    System.out.print(matrix[i] [j] + "  ");
              }
               System.out.println();
          }
          System.out.println("transopose of matrix");
          for(int j= 0;j<c;j++){
               for(int i= 0;i<r;i++){
                    System.out.print( matrix[i][j] + "  ");
               }
               System.out.println();
          }
               System.out.println("enter the number you want to found");
              int x = sc.nextInt();
          for(int i =0;i < r;i++){
               for(int j=0;j<c;j++){
               if(x==matrix[i][j]){
           System.out.println ("number found in index number is index ( "+ i +","+ j +")");
               }
          }
     }
 }
}
