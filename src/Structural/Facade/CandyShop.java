package Structural.Facade;

import java.util.ArrayList;

public class CandyShop {
    private String name;
    private Cheif cheif;
    private String flavor;
    private ArrayList<Cake> cakes;

    public CandyShop(String name, Cheif cheif, String flavor) {
        this.name = name;
        this.cheif = cheif;
        this.flavor = flavor;
        this.cakes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Cheif getCheif() {
        return cheif;
    }

    public String getFlavor() {
        return flavor;
    }

    public ArrayList<Cake> getCakes() {
        return cakes;
    }

    public void addCake(Cake c){
        cakes.add(c);
    }
}
