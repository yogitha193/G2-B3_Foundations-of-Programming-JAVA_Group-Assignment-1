package parent.model;

import department.interfaces.SuperDept;

public class SuperDepartment implements SuperDept
{
	public String departmentName()
	{
		return "Welcome to Super Department";
	}
	
	public String getTodaysWork()
	{
		return "No Work as of now";
	}
	
	public String  getWorkDeadline()
	{
		return "Nil ";
	}
	
	public String  isTodayAHoliday()
	{
		return "Today is not a holiday";
	}
	
}
