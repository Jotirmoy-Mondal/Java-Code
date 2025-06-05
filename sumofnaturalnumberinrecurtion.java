import java.util.*;
public class sumofnaturalnumberinrecurtion {
    public static void printnaturalnumber (int n,int m,int sum) {
      //  int m= sc.nextInt();

        if(n==m){
            sum+=n;
            System.out.println(sum);
            return;
        }
        sum+=n;
       // System.out.println(sum);
        printnaturalnumber(n+1,m,sum);
    }
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want print from 1:");
        int m= sc.nextInt();

        int n= 1;
        int sum=0;


        printnaturalnumber(n,m,sum);
       // System.out.println(sum);
    }
}
