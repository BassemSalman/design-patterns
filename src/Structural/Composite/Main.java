package Structural.Composite;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("CEO", 1000);

        Manager m2 = new Manager("m2", 900);
        Manager m3 = new Manager("m3", 900);

        Developer d1 = new Developer("d1", 800);
        Developer d3 = new Developer("d3", 800);
        Developer d2 = new Developer("d2", 800);
        Developer d4 = new Developer("d4", 800);

        m1.addEmps(m2, m3);
        m2.addEmps(d1,d2);
        m3.addEmps(d3,d4);
        m1.print(); // prints l kel through ceo
    }
}
