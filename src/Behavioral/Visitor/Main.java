package Behavioral.Visitor;

public class Main {
    public static void main(String[] args) {
        Designer des = new Designer("des", 100);
        Developer dev = new Developer("dev", 100);

        Visitor v = new IncreaseSalaryVisitor(300, 100);

        // call method associated
        des.accept(v);
        dev.accept(v);

        System.out.println(dev);
        System.out.println(des);
    }
}
