package Structural.Flyweight;

public class Bullet 
{
    private String color;
    private int radius;
    private int damage;

    public Bullet(String color2, int damage2, int radius2) {
    }
    public String getColor() {
        return color;
    }
    public int getDamage() {
        return damage;
    }
    public int getRadius() {
        return radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
}