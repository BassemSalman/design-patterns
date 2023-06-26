package Structural.Bridge;

public class Circle implements Shape{
    private int radius;
    private Color color;

    @Override
    public void displayColoredShape() {
       System.out.println("Circle of rad == " + radius);
       color.displayColor();

    }

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }
    
}
