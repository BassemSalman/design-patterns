package Behavioral.Visitor;

public class Designer extends Employee{
    public Designer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // calling method tabaa l dev
    }
}
