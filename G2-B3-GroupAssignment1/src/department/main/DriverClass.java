package department.main;

import chiledepartments.model.AdminDepartment;
import chiledepartments.model.HrDepartment;
import chiledepartments.model.TechDepartment;

public class DriverClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AdminDepartment a = new AdminDepartment();
		System.out.println(a.departmentName());
		System.out.println(a.getTodaysWork());
		System.out.println(a.getWorkDeadline());
		System.out.println(a.isTodayAHoliday()+"\n");
		
		
		HrDepartment h = new HrDepartment();
		System.out.println(h.departmentName());
		System.out.println(h.doActivity());
		System.out.println(h.getTodaysWork());
		System.out.println(h.getWorkDeadline());
		System.out.println(h.isTodayAHoliday()+"\n");
		
		TechDepartment t = new TechDepartment();
		System.out.println(t.departmentName());
		System.out.println(t.getTodaysWork());
		System.out.println(t.getWorkDeadline());
		System.out.println(t.doActivity());	
		System.out.println(t.isTodayAHoliday()+"\n");		
		
	}

}
