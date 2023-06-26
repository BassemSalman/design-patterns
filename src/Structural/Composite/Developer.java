package Structural.Composite;

public class Developer extends Employee{

    public Developer(String name, int salary) {
        super(name, salary);
    }
    @Override
    public void print() {
        System.out.println("Developer: " + getName());
    }

}
