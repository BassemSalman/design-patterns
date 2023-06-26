package Creational.Builder;

import Creational.Builder.Builders.GaminggComputerBuilder;

public class Main {
    public static void main(String[] args) {
        Director dir = new Director();
        dir.setBuilder(new GaminggComputerBuilder());
        dir.constructComputer();
        
        Computer c = dir.getComputer();
    }
}
