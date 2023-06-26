package Behavioral.Iterator;

import java.util.ArrayList;

public class ReverseIterator extends Iterator{
    public ReverseIterator(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void first() {
        position = employees.size()-1;
    }

    @Override
    public void next() {
        position --;
    }

    @Override
    public boolean isDone() {
        return position <= -1;
    }

    @Override
    public Employee current() {
        return employees.get(position);
    }
}
