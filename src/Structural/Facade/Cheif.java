package Structural.Facade;

public class Cheif {
    private String name;

    public Cheif(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Cake bakeCake(String flavor){
        return new Cake(flavor);
    }
}
