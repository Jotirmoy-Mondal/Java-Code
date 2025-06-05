import java.util.*;
public class recursionindex{
     public static int first=-1,last=-1;
     public static void firstandlastindex(String str,int indx,char element ){
          if(indx==str.length()){
               System.out.println(first);
               System.out.println(last);
               return;
          }
          char currentchar=str.charAt(indx);
          if(currentchar==element){
               if(first== -1){
                    first=indx;
               }else{
                    last=indx;
               }
          }
          firstandlastindex(str,indx+1,element);
}
     public static void main(String[]args){
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the string");
          String str=sc.nextLine();
       //    int indx=0;
          //   System.out.println("enter the element");
         //  element=sc.next();
          firstandlastindex(str,0,'t');
     }
}
