package DesignPattern.AbstractDesign;

public class WD implements Employee {

    @Override
    public int salary() {
        return 4000;
    }

    @Override
    public String name() {
        System.out.println("I am Web Developer");
        return "WEB DEVELOPER";
    }
    
}
