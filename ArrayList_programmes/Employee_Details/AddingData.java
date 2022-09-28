package Employee_ArrayList;

import java.util.ArrayList;
// this class for adding data of employee using arraylist method
public class AddingData {
    ArrayList<Employee> EmployeeData(){
        // Create three objects of the class Employee and pass arguments to the constructor.
        Employee e1 = new Employee("kanha","wipro",12000);
        Employee e2 = new Employee("ritesh","Datamatics",35000);
        Employee e3 = new Employee("souraj","IBM",12000);
        Employee e4 = new Employee("sam","congient",8000);
        Employee e5 = new Employee("alok","goggle",352000);

        // Create the object of ArrayList of generic type 'Employee'.

        ArrayList<Employee> e = new ArrayList<Employee>();
         e.add(e1);
        e.add(e2);
        e.add(e3);
        e.add(e4);
        e.add(e5);
        // Return object reference variable 'e' of the array list to the method 'EmployeeData'.
        return  e;


    }
}
