package DesignPattern.AbstractDesign;

public class AD implements Employee {

    @Override
    public int salary() {
        return 1000;
    }

    @Override
    public String name() {
        System.out.println("I am Android Developer");
        return "ANDROID DEVELOPER";
    }
    
}
