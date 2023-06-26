package Creational.Builder;

import Creational.Builder.Builders.Builder;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder=builder;
    }

    // depends on builder type
    public void constructComputer(){
        builder.makeType();
        builder.makeMemory();
        builder.makeProcessor();
        builder.makeMonitor();
    }

    // after howe bi3aytlon, redelle hal rayis
    public Computer getComputer(){
        return builder.getComputer();
    }
}
