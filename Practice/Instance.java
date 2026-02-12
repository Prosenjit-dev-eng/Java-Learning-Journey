package Practice;

public class Instance {
    {
        System.out.println("Instance initializer block :1");
        
    }
    {
        System.out.println("Instance initializer block :2");

    }
    public Instance(){
        System.out.println("Class Constructor");
    }
    public static void main(String[] args) {
        Instance iib = new Instance();
    }
}
