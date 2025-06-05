 interface Animal{
     int eyes=2;
  void walk();
 
}
interface Herbivore{

}
class Horse implements Animal{
     public void walk(){
          System.out.println("walk on 4 leg");
     }
}
class Chiken implements Animal{
     public void walk(){
          System.out.println("walk on 2 leg");
     }
}
 public class oppsinterfaces{
     public static void main(String[] args){
         //  Animal Animal=  new Animal();
        Horse h= new Horse();
        Chiken c=  new Chiken();
         //   Animal.eat();
        h.walk();
        c.walk();
     }
 }