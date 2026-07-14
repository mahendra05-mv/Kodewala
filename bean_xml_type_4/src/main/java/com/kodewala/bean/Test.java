package com.kodewala.bean;

public class Test {

	private int marks;
	private String status;
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void showData()
	{
		System.out.println("marks : " +this.marks + " & the candidate has " + this.status + " the exam");
	}
}
