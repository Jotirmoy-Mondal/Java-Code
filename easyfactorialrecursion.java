import java.util.*;
public class easyfactorialrecursion {
    public static int printfactorial2 (int n) {
      //  int m= sc.nextInt();

        if(n==1 || n==0){
           // factorial*=n;
           // System.out.println(factorial);
            return 1;
        }
       // System.out.println(sum);
       int fac=printfactorial2(n-1);
        int factorial=n*fac;
        return factorial;
      //  System.out.println("factorial of"+n+"="+factorial);
    }
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want print factorial:");
        int n= sc.nextInt();

       // int n= 1;
        //int factorial=0;


       int factorial= printfactorial2(n);
        System.out.println(factorial);
       // System.out.println(sum);
    }
}
