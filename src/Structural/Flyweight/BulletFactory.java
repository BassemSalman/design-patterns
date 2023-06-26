package Structural.Flyweight;

import java.util.HashMap;

public class BulletFactory {
    private static HashMap<String, Bullet> hm = new HashMap<>();
    
    public static Bullet getBullet(String color, int damage, int radius){
        Bullet b = (Bullet)hm.get(color);
        if(b == null){
            b = new Bullet(color, damage, radius);
            hm.put(color, b);
        }
        return b;
    }
}
