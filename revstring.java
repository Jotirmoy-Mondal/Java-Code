import java.util.*;
public class revstring{
     public static void reversestring(String str,int indx ){
if(indx==0){
     System.out.println(str.charAt(indx) );
return;
}
System.out.println(str.charAt(indx) );
reversestring(str,indx-1);
}
     public static void main(String[]args){
          Scanner sc = new Scanner(System.in);
          String str=sc.nextLine();
          int indx=str.length()-1;
          reversestring(str,indx);
     }
}
