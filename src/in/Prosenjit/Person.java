package in.Prosenjit;

public class Person {
    private String name;
    private int age;
    private String id;
    
    public Person(String name, String id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append("name= ").append(name).append('\'');
        sb.append(", age= ").append(age);
        sb.append(", id= ").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }
    
}