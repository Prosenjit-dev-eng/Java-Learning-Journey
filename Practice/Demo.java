package Practice;

class Box {
    double len,wd,ht;
}
// Inheritence
class ColorBox extends Box{
    int color;
    ColorBox(double w, double h, int c){
        wd = w;
        ht = h;
        color = c;
    }
    
}
class Demo {
    public static void main(String[] args) {
        Box b1,b2;
        b1 = new Box();
        b2 = new Box();
        b1.len = 5;
        b1.wd = 6;
        b1.ht = 3;
        System.out.println("box b1 is (" + b1.len + ", " + b1.wd + " , " + b1.ht + ") " );
        b2.wd = 65;
    } 
}
