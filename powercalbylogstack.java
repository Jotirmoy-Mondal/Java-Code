import java.util.*;
public class powercalbylogstack {
    public static int powlogstack(int x,int n) {
      //  int m= sc.nextInt();

        if(n==0){
           // factorial*=n;
           // System.out.println(factorial);
            return 1 ;
        }

       // System.out.println(sum);
        if(n%2==0){
          return powlogstack(x,n/2)*powlogstack(x,n/2);
        }else{
         return powlogstack(x,n/2)*powlogstack(x,n/2)*x;
        }
      
    }
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want print power and power:");
        int x= sc.nextInt();
        int n= sc.nextInt();


       // int n= 1;
        //int factorial=0;


       int ans=powlogstack(x,n);
          System.out.println(ans);
       // System.out.println(sum);
    }
}
