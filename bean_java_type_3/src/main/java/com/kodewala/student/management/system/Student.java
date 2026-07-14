package com.kodewala.student.management.system;

public class Student {

	private int id;
	private String name;
	private double marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void study()
	{
		if(marks < 80)
		{
			System.out.println(name + " really needs to study");
		}
		else
		{
			System.out.println(name + " should keep up the good work XD");
		}
	}
	public void showResult()
	{
		System.out.println(name + " with student id : " + id + " got " + marks + " marks");
	}
}
