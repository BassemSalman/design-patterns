package Creational.Factory.RacesCreator;
import java.util.ArrayList;
import Creational.Factory.BikesProduct.*;;

public abstract class Race{
    private ArrayList<Bike> bikes;

    public abstract Bike createBike(); // factory method

    public void createRace(){
        for(int i = 0; i<10; i++){
            bikes.add(createBike()); // impl of createBike is dependant on type of race
        }
    }

}