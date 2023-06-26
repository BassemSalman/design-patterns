package Creational.Builder.Builders;

public class GaminggComputerBuilder extends Builder{

    @Override
    public void makeType() {
        computer.setType("Gaming");
    }

    @Override
    public void makeMonitor() {
        computer.setMonitor("144hz");
    }

    @Override
    public void makeProcessor() {
        computer.setProcessor("i9");
    }

    @Override
    public void makeMemory() {
        computer.setMemory("32GB");
    }
    
}
