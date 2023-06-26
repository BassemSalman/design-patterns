package Structural.Composite;

import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Employee> employees = new ArrayList<>();

    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void print(){
        System.out.println("Manager : " + getName());
        for(Employee e : employees){
            e.print(); // if huwe kamen manager => enters this print w bshuf l wled
        }
    }

    public void addEmps(Employee... emps){
        for(Employee e : emps){
            employees.add(e);
        }
    }
}
