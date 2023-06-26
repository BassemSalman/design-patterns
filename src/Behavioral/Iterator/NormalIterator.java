package Behavioral.Iterator;

import java.util.ArrayList;

public class NormalIterator extends Iterator{
    public NormalIterator(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public void next() {
        position ++;
    }

    @Override
    public boolean isDone() {
        return position >= employees.size();
    }

    @Override
    public Employee current() {
        return employees.get(position);
    }
}
