/*
3.	Implementation:
    Use an array to store employee records.
    Implement methods to add, search, traverse, and delete employees in the array.

 */
public class EmpList {

    private Employee[] employees;
    private int size;

    public EmpList(int capacity){
        employees = new Employee[capacity];
        size = 0;
    }

    //Add new employee in the array
    public boolean addEmp(Employee employee){
        //if the Array is full, we cannot add anymore employees
        if(size>= employees.length){
            return false;
        }
        //add employee to the next index
        employees[size++] = employee;
        System.out.println("ADDED EMPLOYEE TO LIST");
        return true;
    }

    //Search an employee from the array using the employee ID
    public Employee searchEmp(int employeeId){
        for(int i=0;i<size;i++){
            if(employees[i].getEmployeeId() == employeeId){
                return employees[i];
            }

        }
        return null;
    }

    //view all employees
    public void Transverse(){
        for(int i=0;i<size;i++){
            System.out.println(employees[i]);
        }
    }

    //Delete an employee from the array
    public boolean deleteEmp(int employeeId){
        for(int i=0;i<size;i++){
            if(employees[i].getEmployeeId() == employeeId){
                //removing the employee details by moving it to the last index and making it null
                employees[i] = employees[size-1];
                employees[--size] = null;
                return true;
            }
        }
        //if the employee is not found
        return false;
    }

    //main function
    public static void main(String[] args) {
        EmpList emp = new EmpList(10);
        //Add function
        System.out.println("ADD EMPLOYEE");
        emp.addEmp(new Employee(1,"Name1","position1", 123400));
        emp.addEmp(new Employee(2,"Name2","position2",456700));

        //View function
        System.out.println("EMPLOYEE LIST");
        emp.Transverse();

        //Search Function
        System.out.println("SEARCH EMPLOYEE");
        System.out.println(emp.searchEmp(1));

        //delete function
        System.out.println("DELETE EMPLOYEE");
        if (emp.deleteEmp(2)){
            System.out.println("DELETED THE EMPLOYEE");
        }
        else {
            System.out.println("EMPLOYEE NOT FOUND");
        }
        emp.Transverse();


    }
}
/*
4.	Analysis:
Analyze the time complexity of each operation (add, search, traverse, delete).
    *ADD OPERATION = O(1)- constant time operation
    *SEARCH OPERATION = O(n) - where n is the size of the array
    *TRAVERSE OPERATION = O(n) - n is the size of the array
    *DELETE OPERATION = O(n)
Discuss the limitations of arrays and when to use them.
    *Arrays have limited size which cannot be extended dynamically.
    *Arrays are less efficient than other data structures like HashMaps and LinkedLists.

 */
