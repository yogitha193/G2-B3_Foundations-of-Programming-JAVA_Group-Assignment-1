package chiledepartments.model;

import department.interfaces.TechDept;
import parent.model.SuperDepartment;

public class TechDepartment extends SuperDepartment implements TechDept
{
	public String departmentName()
	{
		return "Welcome to Tech Department ";
	}
	
	public String getTodaysWork()
	{
		return "Complete coding of module 1";
	}

	public String  getWorkDeadline()
	{
		return "Complete by EOD";
	}
	
	public String  doActivity()
	{
		return "core Java";
	}
}
