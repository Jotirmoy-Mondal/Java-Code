import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the string size: ");
        int size = sc.nextInt();
        String nam[] = new String[size];
        int totLength = 0;
        for (int i = 0; i < size; i++) {
            nam[i] = sc.nextLine();
            totLength += nam[i].length();
        }
        System.out.println(totLength);
    }
}
