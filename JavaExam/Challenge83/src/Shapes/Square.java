import Shapes.Main;

public class Square extends Main.Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    @Override
    public  double calculateArea() {
        return side * side;
    }
}
