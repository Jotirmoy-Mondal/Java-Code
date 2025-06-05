import java.util.*;
public class factorialrecursion {
    public static void printfactorial (int n,int m,int factorial) {
      //  int m= sc.nextInt();

        if(n==m){
            factorial*=n;
            System.out.println(factorial);
            return;
        }
        factorial*=n;
       // System.out.println(sum);
        printfactorial(n+1,m,factorial);
        System.out.println("factorial of"+n+"="+factorial);
    }
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want print from 1:");
        int m= sc.nextInt();

        int n= 1;
        //int factorial=0;


        printfactorial(n,m,1);
       // System.out.println(sum);
    }
}
