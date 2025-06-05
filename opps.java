import java.util.*;
class Student{
String name;
int age;
//   float hight;
String gender;
public void printinfo(){
     System.out.println(this.name+"\n"+this.age +"\n"+this.gender);
}
// non parameter constranct
// Student(){
  //   System.out.println("called construct");
// }
//}
// public class opps{
//      public static void main(String []args){
       //   Scanner sc = new Scanner(System.in);
      //    Student s=new Student();
       //   s.name=sc.nextLine();
       //   s.age=sc.nextInt();
         //    s.hight=sc.nextfloat();
       //   s.gender=sc.next();
       //   s.printinfo();


       // parameter constract
       Student(String name,int age,String gender){
          this.name=name;
          this.age=age;
          this.gender=gender;
       }

     } 
public class opps{
     public static void main(String[] args){
          Student s=new Student("Jotirmoy",21,"male");
          s.printinfo();
     }
}
