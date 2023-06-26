package Structural.Flyweight;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue"}; 
        for(String color : colors){
            BulletFactory.getBullet(color, 6, 7); // creates them all to hashmap
        }
    }   
}
