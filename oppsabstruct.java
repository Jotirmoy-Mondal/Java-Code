abstract class Animal{
 abstract void walk();
 Animal(){
     System.out.println("we are creating an Animal");
 }
 public void eat(){
     System.out .println("every animal can eat");
 }
}
class Horse extends Animal{
     public void walk(){
          System.out.println("walk on 4 leg");
     }
}
class Chiken extends Animal{
     public void walk(){
          System.out.println("walk on 2 leg");
     }
}
 public class oppsabstruct{
     public static void main(String[] args){
         //  Animal Animal=  new Animal();
        Horse h= new Horse();
        Chiken c=  new Chiken();
          Animal.eat();
        h.walk();
        c.walk();
     }
 }