/*
1.	Understand Array Representation:
    Explain how arrays are represented in memory and their advantages.
        *Arrays are stored in continuous memory locations and their positions are indexed.
        *The access time of arrays is very low and their sizes can be fixed meaning less memory allocation.
2.	Setup:
o	Create a class Employee with attributes like employeeId, name, position, and salary.

 */
public class Employee {
    private int employeeId;
    private String name;
    private String Position;
    private Double salary;

    public Employee(int employeeId, String name, String position,double salary){
        this.employeeId = employeeId;
        this.name = name;
        this.Position = position;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "EMPLOYEES [employeeId= "+employeeId+ ", name = "+name+", position = "+Position+ ", Salary = "+salary+" ].";

    }

}
