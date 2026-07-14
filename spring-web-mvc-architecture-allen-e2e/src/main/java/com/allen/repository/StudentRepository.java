package com.allen.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.allen.request.StudentInfoRequest;

@Repository
public class StudentRepository {

	public boolean studentRepository(@ModelAttribute StudentInfoRequest req)
	{
		System.out.println("StudentRepository START");
		System.out.println("StudentRepository Name : " +req.getName());
		System.out.println("StudentRepository City : " +req.getCity());
		System.out.println("StudentRepository Mobile : " +req.getMob());
		System.out.println("StudentRepository Email : " +req.getEmail());
		System.out.println("StudentRepository END");
		return true;
	}
}
