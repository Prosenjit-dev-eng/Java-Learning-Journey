package JAVACLG.Assignment1;

class Circle{
        static final double PI = 3.14;
        double radius;
        Circle(){
            radius = 5;
        }
        Circle(double r){
            radius = r;
        }
        Circle(Circle c){
            radius = c.radius;
        }

        double calArea(){
            return PI*radius*radius;
        }
        
    public static void main(String[] args) {
        Circle c1,c2,c3,c4;
        c1 = new Circle(2);
        c2 = c1;// Shallow copy
        System.out.println("The area of c1 is : " +c1.calArea());
        System.out.println("The area of c2 is : " +c2.calArea());
        c1.radius = 3;
        System.out.println("The area of c1 is : " +c1.calArea());
        System.out.println("The area of c2 is : " +c2.calArea());

        c3 = new Circle(2);
        c4 = new Circle(c3);// Deep copy

        System.out.println("The area of c3 is : " +c3.calArea());
        System.out.println("The area of c4 is : " +c4.calArea());
        c3.radius = 3;
        System.out.println("The area of c3 is : " +c3.calArea());
        System.out.println("The area of c4 is : " +c4.calArea());

    }
}

