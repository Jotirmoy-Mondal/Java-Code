import java.util.*;
public class Strings{
     public static void main(String args[]){
          Scanner sc= new Scanner(System.in);
          String name=sc.nextLine();
          String title=sc.nextLine();
          String fullname=(name + " " +title);
          System.out.println("full name\n" + fullname);
          System.out.println("Length\n" + fullname.length());
          for(int i=0;i<fullname.length();i++){
               System.out.println("character\n" + fullname.charAt(i));
          }
               if((name).compareTo (title)==0){
                    System.out.println("they are same string");
               }else if(name.compareTo (title)>0){
                    System.out.println("they are not same string and first string is bigger than second string");
               }else{
                    System.out.println("they are not same string and first string is lesser than second string");
               }
               System.out.println("substring\n" + fullname.substring(2,fullname.length()));
               //parse int mathod if intiger class
               // String srt= "123";
                //int number=intiger.parseInt(srt);
               // System.out.println(number);
               // int number="123";
              //  String srt=intiger.ToString(number);
                //System.out.println(srt.length);



          }
     }
     