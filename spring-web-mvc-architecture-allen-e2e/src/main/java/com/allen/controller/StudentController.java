package com.allen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.allen.request.StudentInfoRequest;
import com.allen.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService stuSer;
	
	@PostMapping("connect")
	public String getAdmission(@ModelAttribute StudentInfoRequest req)
	{
		System.out.println("StudentController.getAdmission() START");
		
		stuSer.studentService(req);
		
		System.out.println("StudentController.getAdmission() END");
		
		return "courses-page";
	}
}
