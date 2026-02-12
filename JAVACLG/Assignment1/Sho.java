package JAVACLG.Assignment1;

public class Sho {
    void show(int x){
        System.out.println("show(int) called : " + x);
    }
    void show(double x){
        System.out.println("show(int) called : " + x);
    }
    public static void main(String[] args) {
        Sho S = new Sho();

        short sh = 10;
        double d = 100;
        
        S.show(sh);
        S.show(d);

    }
}
