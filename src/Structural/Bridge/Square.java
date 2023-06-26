package Structural.Bridge;

public class Square implements Shape{
    private int width;
    private Color color;

    public Square(int width, Color color){
        this.width=width;
        this.color=color;
    }
    @Override
    public void displayColoredShape(){
        System.out.println("Square with width = " + width);
        color.displayColor();
    }
}
