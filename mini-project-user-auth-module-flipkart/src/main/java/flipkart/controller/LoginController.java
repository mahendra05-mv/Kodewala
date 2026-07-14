package flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import flipkart.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService logSer;
	
	@PostMapping("doLogin")
	public String doLogin(@RequestParam("email") String email, @RequestParam("pass") String pass, Model msg)
	{
		msg.addAttribute(logSer.loginAuth(email, pass));
		
		return "msg-page";
	}
}
