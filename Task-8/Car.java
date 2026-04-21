package Task-8;

public class Car{
    int noOfWheels, noOfDoors, maxSpeed;
    String name, modelNo, company;
    public Car(int noOfWheels, int noOfDoors, int maxSpeed,String name,String modelNo, String company){
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNo = modelNo;
        this.company = company;
    }
    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Car swift = new Car(4,4,120,"Swift","SW876","Maruti");
        System.out.println(swift);

    }
}
