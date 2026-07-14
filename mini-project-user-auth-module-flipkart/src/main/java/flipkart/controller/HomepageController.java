package flipkart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

	@GetMapping("goToLoginPage")
	public String toLoginPage()
	{
		return "login-page";
	}
	
	@GetMapping("goToSignUpPage")
	public String toSignUpPage()
	{
		return "signup-page";
	}
}
