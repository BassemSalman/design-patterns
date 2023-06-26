package Behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(new Division());
        System.out.println(c.doCalculation(4,2));


    }
}
