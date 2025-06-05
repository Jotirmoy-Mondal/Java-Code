import java.util.*;
import bank;

class Shape{
    // String colour;
    public void area(){
     System.out . println("print area of tringle");
    }
}
     class Triangle extends Shape{
          public void area(int l,int h){
               System.out.println((1/2)*l*h);
          }
     }
public class singlLevelInheritance{
     public static void main(String[] args){
          account=new bank.account();
          Triangle t=new Triangle();
         //  t.colour="red";
          t.area();

     }
}
