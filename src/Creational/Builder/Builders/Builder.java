package Creational.Builder.Builders;
import Creational.Builder.Computer;

public abstract class Builder {
    protected Computer computer = new Computer(); // access from wlede

    public Computer getComputer(){ // bel ekhir
        return computer;
    }

    public abstract void makeType();
    public abstract void makeMonitor();
    public abstract void makeProcessor();
    public abstract void makeMemory();
}
