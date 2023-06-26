package Behavioral.Visitor;

public interface Visitor {
    public void visit(Developer developer);

    public void visit(Designer designer);
}
