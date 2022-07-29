package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Shobana Ravi");
	}
	
	public void studentDept()
	{
		System.out.println("Aero");
	}
	public void studentID()
	{
		System.out.println("123456");
	}
	
	public void getStudentInfo(String emailID , String phoneNO)
	{
		System.out.println("Email ID and phone number argument Student info");
	}
	
	public void getStudentInfo(String name , int studentID)
	{
		System.out.println("Name and Student ID argument Student info");
	}
	
	public void getStudentInfo(int studentID)
	{
		System.out.println("Student ID argument Student info");
	}
	
	public static void main(String[] args) {
		
		Student var = new Student();
		
		var.studentName();
		var.collegeName();  //from class College
		var.deptName();    // from class Department
		
		
	}
	
}
