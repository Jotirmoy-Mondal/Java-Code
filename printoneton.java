import java.util.*;
public class printoneton {
    public static void print1ton (int n,int m) {
      //  int m= sc.nextInt();

        if(n>m){
            return;
        }
        System.out.println(n);
        print1ton(n+1,m);
    }
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want print from 1:");
        int m= sc.nextInt();

        int n= 1;


        print1ton(n,m);
    }
}
