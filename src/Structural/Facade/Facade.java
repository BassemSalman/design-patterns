package Structural.Facade;

public class Facade {
    public static CandyShop setUpCandyShop(String shopName, String chefName, String flavor) {
        Cheif cheif = new Cheif(chefName);
        CandyShop candyShop = new CandyShop(shopName, cheif, flavor);
        for(int i = 0; i<10; i++){
            Cake c = cheif.bakeCake(flavor);
            candyShop.addCake(c);
//       instead of new cake bas ta nfarje ahamiyta
        }
        return candyShop;
    }
}
