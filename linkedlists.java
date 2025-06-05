import java.util.LinkedList;
 public class linkedlists{
     public static void main(String[]args){
          LinkedList<String>list=new LinkedList<>();
          //add list
list.addFirst("love");
list.addFirst("I");
System.out.println("add of list:\n"+list);
// add last
list.addLast("you");
list.add("Jotirmoy");
System.out .println("add in last of list\n"+list);
//get list
for(int i=0;i<list.size();i++)
System.out.println(list.get(i));
//delete list
list.remove(3);
System.out.println("remove list\n"+list);
//size
int s=list.size();
System.out.println("size of the list\n"+s);
//iteration
System.out.println("every element of the list\n");
for(int i = 0; i<list.size(); i++){
     System.out.println(list.get(i));
}
          
     }
}