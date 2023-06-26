package Creational.Factory;
import Creational.Factory.RacesCreator.*;
public class Main{
    public static void main(String[] args) {
        MountainRace mr = new MountainRace();
        mr.createRace(); // calls createBike accordingly
    }
}