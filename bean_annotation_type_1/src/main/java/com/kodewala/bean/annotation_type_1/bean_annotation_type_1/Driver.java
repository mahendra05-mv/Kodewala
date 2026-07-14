package com.kodewala.bean.annotation_type_1.bean_annotation_type_1;

public class Driver {

	public static void main(String args[]) 
	{
	
		Address add = new Address("N-115, Ashiana Amarbagh, Pali Road", "Jodhpur", "Rajasthan");
//		Employee emp = new Employee("Mahendra", "Vishnoi", "mahendra05.mv@gmail.com", add);
		Employee emp = new Employee("Mahendra", "Vishnoi", "mahendra05.mv@gmail.com");
		
		emp.setAddress(add);
		
		
		
	}
}
