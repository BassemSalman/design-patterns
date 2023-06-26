package Behavioral.Visitor;

public class IncreaseSalaryVisitor implements Visitor{
    private int devRaise, desRaise;

    public IncreaseSalaryVisitor(int devRaise, int desRaise) {
        this.devRaise = devRaise;
        this.desRaise = desRaise;
    }

    @Override
    public void visit(Developer developer) {
        developer.setSalary(developer.getSalary()+devRaise);
    }

    @Override
    public void visit(Designer designer) {
        designer.setSalary(designer.getSalary()+desRaise);
    }
}
