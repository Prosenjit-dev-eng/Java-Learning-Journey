/*5. Write a program where class contains void show(int) to display the argument passed. Call the function once with short as actual parameter and again double as actual parameter. Add another function as void show(double) . Repeat the calls. Observe the outcomes in each case. */
// Name: Prosenjit Hawlader
// Roll No: 002410501066
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
