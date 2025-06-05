import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int button =sc.nextInt();
       switch(button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("hi");
                break;
            case 3:
                System.out.println("salam");
                break;
           default:
               System.out.println( "sorry u have pressed wrong button");
        }
        }

}