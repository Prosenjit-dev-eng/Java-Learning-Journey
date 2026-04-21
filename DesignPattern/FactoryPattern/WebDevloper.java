package DesignPattern.FactoryPattern;

public class WebDevloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Web Developer Salary");
        return 40000;
    }
    
}
