package Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        ImageProxy ip = new ImageProxy("text.pdf");
        ip.display(); // ma by2bl

        ImageProxy ip2 = new ImageProxy("text.png");
        ip2.display(); // ebil
    }
}