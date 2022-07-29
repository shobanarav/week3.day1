package org.college;

import org.student.Student;

public class College {

	public void collegeName()
	{
		System.out.println("KCG College Of Technology");
	}
	
	public void collegeCode()
	{
		System.out.println("1012548");
	}
	
	public void collegeRank()
	{
		System.out.println("26th");
	}
	
	public static void main(String[] args) {
		
		Student var = new Student();
		var.getStudentInfo(123);
		var.getStudentInfo("Shobana" ,123);
		var.getStudentInfo("abc@gmail.com", "9994023565");
		
	}
}
