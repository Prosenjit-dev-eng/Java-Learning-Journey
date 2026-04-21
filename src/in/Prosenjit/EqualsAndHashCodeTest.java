package src.in.Prosenjit;
import in.Prosenjit.Person;
public class EqualsAndHashCodeTest {
    public static void main(String[] args){
        Person pe1 = new Person("Pro",22,"102");
        Person pe2 = new Person("Pro",22,"102");

//        if (pe1 == pe2){
//            System.out.println("Equals");
//        }
//        else{
//            System.out.println("Not equals");
//        }=> not equals

        if (pe1.equals(pe2)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
