package Behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        Store s = new Store("Shop");
        Client c1 = new Client("Ali");
        Client c2 = new Client("Bassem");

        s.subscribe(c1);
        s.subscribe(c2);

        s.notifySubscribers();
    }
}
