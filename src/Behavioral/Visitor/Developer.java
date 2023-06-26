package Behavioral.Visitor;

public class Developer extends Employee{
    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
