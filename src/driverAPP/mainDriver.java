package driverAPP;

import allDepartments.adminDepartment;
import allDepartments.hrDepartment;
import allDepartments.techDepartment;

public class mainDriver {

	public static void main(String[] args)
	{
		//Admin
		adminDepartment admin = new adminDepartment();
		System.out.println("Welcome to " + admin.departmentName()+" :");
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday()+"\n");
		
		//HR
		hrDepartment hr = new hrDepartment();
		System.out.println("Welcome to " + hr.departmentName()+" :");
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday()+"\n");
		
		//Tech
		techDepartment tech = new techDepartment();
		System.out.println("Welcome to " + tech.departmentName()+" :");
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday()+"\n");
	}
}