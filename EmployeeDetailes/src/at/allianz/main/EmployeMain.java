package at.allianz.main;
import at.allianz.updates.*;
import at.allianz.employee.*;
import at.allianz.employee.*;

public class EmployeMain{
	
	
	public static void main(String [] args)
	{
		Salary salary=new Salary(2000, 0, 0, false);
		
		Employee e=new Employee("Ashish","Shedge",salary);
		
		EmployeeUpdates employeeUpdates=new EmployeeUpdates();
		
		employeeUpdates.UpdateEmployeeDetails(10000.0, e);
	}

}
