package Creational.Builder;
public class Computer{
    private String type;
    private String memory;
    private String monitor;
    private String processor;

    
    public void setType(String type) {
        this.type = type;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public String getType() {
        return type;
    }
    public String getMemory() {
        return memory;
    }
    public String getMonitor() {
        return monitor;
    }
    public String getProcessor() {
        return processor;
    }

}