package DesignPattern.FactoryPattern;

public class AndroidDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Android Developer Salary");
        return 50000;
    }
    
}
