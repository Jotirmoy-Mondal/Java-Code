import java.util.*;
public class recursions {
    public static void printnto1 (int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printnto1(n-1);
    }
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want print to 1");
        int n= sc.nextInt();
        printnto1(n);
    }
}
