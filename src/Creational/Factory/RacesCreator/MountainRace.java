package Creational.Factory.RacesCreator;
import Creational.Factory.BikesProduct.*;;
public class MountainRace extends Race {

    @Override 
    public Bike createBike(){
        return new MountainBike();
    }
}