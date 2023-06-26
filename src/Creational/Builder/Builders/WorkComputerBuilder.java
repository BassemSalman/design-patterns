package Creational.Builder.Builders;

public class WorkComputerBuilder extends Builder{

    @Override
    public void makeType() {
        computer.setType("Work");
    }

    @Override
    public void makeMonitor() {
        computer.setMonitor("60hz");
    }

    @Override
    public void makeProcessor() {
        computer.setProcessor("i5");
    }

    @Override
    public void makeMemory() {
        computer.setMemory("16GB");
    }
    
}
