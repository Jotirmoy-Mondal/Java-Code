public class Main {
    public static void main(String[] args) {
        int n=5,pos=2;
        int bm=1<<pos;
        int not=~bm;
        int clear=not & n;
        System.out.println(clear);
    }
}
