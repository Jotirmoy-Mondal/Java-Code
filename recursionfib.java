import java.util.*;
public class recursionfib {
    public static void fibonacci(int a,int b,int n) {
      //  int m= sc.nextInt();

        if(n==0){
           // factorial*=n;
           // System.out.println(factorial);
            return ;
        }
       // System.out.println(sum);
        int c=a+b;
        System.out.println(c);
       fibonacci(b,c,n-1);
     //   System.out.println(c);
      //  System.out.println("factorial of"+n+"="+factorial);
    }
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want print fibonacci:");
        int n= sc.nextInt();
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);

       // int n= 1;
        //int factorial=0;


       fibonacci(a,b,n-2);
       //   System.out.println(fib);
       // System.out.println(sum);
    }
}
