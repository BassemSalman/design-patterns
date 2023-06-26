package Structural.Facade;

public class Main {
    public static void main(String[] args){
//        Facade f = new Facade(); aamlta static ahsn
        CandyShop c = Facade.setUpCandyShop("ChocoShop", "Sam", "Chocolate");
        System.out.println(c.getFlavor());
        System.out.println(c.getCheif());
        System.out.println(c.getCakes());
    }
}
