package DesignPattern.FactoryPattern;

public class EmployeeFactory {
    // Get the employee type and return the corresponding employee object
    public static Employee getEmployee(String employeeType) {
        if(employeeType.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();
        } else if(employeeType.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDevloper();
        } else {
            return null;
        }
    }
}
