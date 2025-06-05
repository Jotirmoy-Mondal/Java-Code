public class Main {
    public static void main(String[] args) {
        int n=5,pos=3;
        int bm=1<<pos;
        if((n & bm)==0) {
            System.out.println("bit was zero");
        }else {
            System.out.println("bit was non zero");
        }
    }
}