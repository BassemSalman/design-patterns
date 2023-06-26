package Behavioral.Observer;

public class Client implements Observer{
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("I received notification");
    }
}
