package Behavioral.Iterator;

import java.util.ArrayList;

public abstract class Iterator {
    protected int position;
    protected ArrayList<Employee> employees;

    public abstract void first();
    public abstract void next();
    public abstract boolean isDone();
    public abstract Employee current();

}
