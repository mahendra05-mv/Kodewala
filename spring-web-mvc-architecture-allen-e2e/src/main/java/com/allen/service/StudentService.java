package com.allen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.allen.repository.StudentRepository;
import com.allen.request.StudentInfoRequest;

@Service
public class StudentService {

	@Autowired
	StudentRepository stuRepo;
	
	public String studentService(@ModelAttribute StudentInfoRequest req)
	{
		System.out.println("StudentService START");
		
		stuRepo.studentRepository(req);
		
		System.out.println("StudentService END");
		return "done from StudentService Side";
	}
	
}
