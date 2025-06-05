import java.util.*;
public class Towerofholoi{
     public static void holoi(int n,String src,String help,String des){
if(n==1){
System.out.println("Transfer disk "+ n +" from "+ src +" to "+ des);
            
return;
}

holoi(n-1,src,des,help);
System.out.println("Transfer disk "+n+" from "+src+" to "+des);
holoi(n-1,help,src,des);
     }
     public static void main(String[]args){
          Scanner sc = new Scanner(System.in);
          int n=sc.nextInt();
          holoi(n,"S","H","D");
     }
}
