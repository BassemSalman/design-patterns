package Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton i1 = Singleton.getInstance();
        Singleton i2 = Singleton.getInstance();

        if(i1 == i2){
            System.out.println("Ane singleton");  
        }
    }
}
