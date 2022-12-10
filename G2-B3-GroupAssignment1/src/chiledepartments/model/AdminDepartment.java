package chiledepartments.model;

import department.interfaces.AdminDept;
import parent.model.SuperDepartment;

public class AdminDepartment extends SuperDepartment implements AdminDept
{
	public String departmentName()
	{
		return "Welcome to Admin Department";
	}
	
	public String getTodaysWork()
	{
		return "Complete your documents Submission";
	}

	public String  getWorkDeadline()
	{
		return "Complete by EOD";
	}
	
}
