package Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5, new Red());
        Square s = new Square(7, new Blue());

        c.displayColoredShape();
        s.displayColoredShape();
        
    }
}
