package Creational.Factory.RacesCreator;
import Creational.Factory.BikesProduct.*;;

public class NormalRace extends Race{
    @Override 
    public Bike createBike(){
        return new NormalBike();
    }
}