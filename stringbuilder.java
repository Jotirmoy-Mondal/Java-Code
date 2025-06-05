  import java.util.*;
public class stringbuilder{
     public static void main(String args[]){
           Scanner sc= new Scanner(System.in);
            System.out.println("write the string: ");
           String name=sc.nextLine();
           StringBuilder nam = new StringBuilder(name);
           System.out.println(nam);
           for(int i=0;i<nam.length();i++){
              System.out.println(nam.charAt(i));
}
          nam.setCharAt(0, 'c');
          System.out.println("after using setchar\n" + nam);
         nam.insert(0, 'm');
 System.out.println("after using insert\n" + nam);
 nam.delete(0,1);
System.out.println("after using delete\n" + nam);
nam.append("Mondal");
System.out.println("after using append\n"+nam);
     }

}