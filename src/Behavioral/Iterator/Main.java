package Behavioral.Iterator;

public class Main {
    public static void main(String[] args) {
        Company c = new Company("Apple");
        Employee e1 = new Employee("Employee1", 1000);
        Employee e2 = new Employee("Employee2", 1000);
        Employee e3 = new Employee("Employee3", 1000);

        c.addEmployee(e1);
        c.addEmployee(e2);
        c.addEmployee(e3);

        Iterator i1 = new NormalIterator(c.getEmployees());
        for(i1.first(); !i1.isDone(); i1.next()){
            System.out.println(i1);
        }
    }
}
