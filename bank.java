
class Account{
     private String pass;

public String getpass(){
     return this.pass;
}
public  void setpass(String password){
this.pass=password;
}
}
public class bank{
     public static void main(String[] args) {
     
     Account a= new Account();
     a.setpass("abcd");
     System.out.println(a.getpass());
     }
}