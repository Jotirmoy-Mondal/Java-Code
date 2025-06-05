import java.util.ArrayList;
 public class arraylists{
     public static void main(String[]args){
          ArrayList<Integer>list=new ArrayList<>();
          //add list
list.add(4);
list.add(7);
list.add(5);
list.add(8);
System.out.println("add of list:\n"+list);
//add list in between
list.add(1,3);
System.out .println("add in between of list\n"+list);
//get list
int element=list.get(2);
System.out.println("get list\n"+element);
//set list
list.set(2,2);
System.out.println("set list\n"+list);
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