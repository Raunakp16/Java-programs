import java.util.ArrayList;

// User-defined class

class Employee{
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id , String name , double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    // Override toString() method to print object details
    public String toString(){
        return "ID:" + id+ ",Name:" +name+ ",salary:" +salary;
    }
}

public class EmployeeDemo {
    public static void main(String[] args){

        // Creating ArrayList to store Employee objects
        ArrayList<Employee> empList =new ArrayList<>();

        //Adding Employee objects
        empList.add(new Employee(32, "Jayesh",10000));
        empList.add(new Employee(55,"Raunak",35000));
        empList.add(new Employee(53, "Atharva",60000));

        // Displaying employee Details
        System.out.println("Employee Details :");
        for (Employee emp:empList){
            System.out.println(emp);
        }

    }
}
