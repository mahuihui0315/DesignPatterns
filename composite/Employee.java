package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private Integer salary;
    private List<Employee> subordinates;

    public Employee(String name,String department,Integer salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.subordinates=new ArrayList<>();
    }

    public void addSubordinate(Employee employee){
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee){
        subordinates.remove(employee);
    }
    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ department + ", salary :"
                + salary+" ]");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }
}
