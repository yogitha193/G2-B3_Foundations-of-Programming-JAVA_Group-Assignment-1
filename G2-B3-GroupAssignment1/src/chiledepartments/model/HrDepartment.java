package chiledepartments.model;

import department.interfaces.HrDept;
import parent.model.SuperDepartment;

public class HrDepartment extends SuperDepartment  implements HrDept
{
	public String departmentName()
	{
		return "Welcome to Hr Department";
	}
	
	public String getTodaysWork()
	{
		return "Fill today's timesheet and mark your attendance";
	}

	public String  getWorkDeadline()
	{
		return "Complete by EOD";
	}
	
	public String  doActivity()
	{
		return "team Lunch";
	}
}
