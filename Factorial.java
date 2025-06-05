import java.util.Scanner;

public class Factorial {
    public static int printFactorial(int n) {
       // System.out.println(sum);
       int factorial=1;
       for(int i=1;i<=n;i++){
        factorial=factorial*i;
       }
       System.out.println(factorial);
        return 0 ;
    }
    public static void main (String[] args){
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();
    //int m=sc.nextInt();
    printFactorial(n);
    }
}

