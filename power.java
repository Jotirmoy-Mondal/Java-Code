import java.util.*;
public class power {
    public static int powercal(int x,int n) {
      //  int m= sc.nextInt();

        if(n==0){
           // factorial*=n;
           // System.out.println(factorial);
            return 1 ;
        }

       // System.out.println(sum);
        
      int pow=powercal(x,n-1);
          int power= x * pow;
          return power;    //   System.out.println(c);
      //  System.out.println("factorial of"+n+"="+factorial);
    }
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want print power and power:");
        int x= sc.nextInt();
        int n= sc.nextInt();


       // int n= 1;
        //int factorial=0;


       int ans=powercal(x,n);
          System.out.println(ans);
       // System.out.println(sum);
    }
}
