import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  string size:");
        int name=sc.nextInt();
        StringBuilder nam=new StringBuilder(name);
       for(int i=0;i<name;i++){
            nam[i]=sc.nextLine();
        }
    }
