package praveenkumar.practice.model;

public class Employee {

    private String name;
    private int eid;

    public Employee(String name,int eid){
        this.name = name;
        this.eid=eid;
    }

    @Override
    public boolean equals(Object o) {

        Employee employee = (Employee) o;

        return this.name.equals(employee.name) && this.eid==employee.eid;
    }

    @Override
    public int hashCode() {
        return eid;
    }
}
