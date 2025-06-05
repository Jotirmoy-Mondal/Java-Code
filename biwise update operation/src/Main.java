public class Main {
    public static void main(String[] args) {
        int n=5,pos=2;
        int bm=1<<pos;
        int newNumber=n ^ bm;
        System.out.println(newNumber);
    }
}
