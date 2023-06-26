package Behavioral.Observer;

import java.util.ArrayList;

public class Store implements Observable{
    private String name;
    private ArrayList<Client> clients;
    public Store(String name) {
        this.name = name;
        clients = new ArrayList<>();
    }

    public void subscribe(Client c){
        clients.add(c);
    }

    @Override
    public void notifySubscribers() {
        for(Client c : clients){
            c.update();
        }
    }
}
