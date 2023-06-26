package Structural.Proxy;

public class RealImage implements Image{
    private String filename;
    // etc attr


    public RealImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display(){
        load();
        System.out.println("Displaying + " + filename);
    }

    public void load(){
        System.out.println("Loading " + filename);
    }

}
