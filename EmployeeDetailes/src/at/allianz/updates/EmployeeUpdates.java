package at.allianz.updates;
import at.allianz.employee.*;

public class EmployeeUpdates{
    
	public void UpdateEmployeeDetails(Double amt, Employee e)
	{
		e.getSalary().setBasic(amt);
		
		System.out.println("Update salary" +e.getSalary().getBasic());
	}
}
