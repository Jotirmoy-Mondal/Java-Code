class animal{
     String name;
     static int leg;
}

public class oppsstatic{
     public static void main(String[]args){
          animal.leg=4;
          animal a=new animal();
          a.name="cow";
System.out.println(a.leg);
          
     }
}