package Employee_ArrayList;

import java.util.ArrayList;

public class RetriveData {
    public static void main(String[] args) {
        // Call AddingData class by creating object of that class.
        AddingData data = new AddingData();

        // Call EmployeeData() method using reference variable data.
        ArrayList<Employee> list = data.EmployeeData();
        for (Employee emp: list)
        {
            if(emp.sal > 25000){
         System.out.println("Name of the Employee = "+" "+emp.name);
            System.out.println("Company of the Employee = "+" "+emp.company);

                System.out.println("Salary of the Employee = " + " " + emp.sal);

            System.out.println();
        }
    }}

}
