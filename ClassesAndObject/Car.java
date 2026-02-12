package ClassesAndObject;
public class Car {
    int noOfWheels, noOfSeats;
    String color;
    float maxSpeed, currentFuelInLiters;
    
    public void drive(){
        System.out.println("Car is driving");
        currentFuelInLiters--;
    }
    public void addFuel(float fuel){
        currentFuelInLiters += fuel;
    }
    public float getCurFuelLevel(){
        return currentFuelInLiters;
    }


}
