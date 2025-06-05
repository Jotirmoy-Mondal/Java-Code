
class Shape{
     String colour;
}
     class Triangle extends Shape{
          public void print(){
               System.out.println(this.colour);
          }
     }
public class oppsinheritance{
     public static void main(String[] args){
          Triangle t=new Triangle();
          t.colour="red";
          t.print();
     }
}
