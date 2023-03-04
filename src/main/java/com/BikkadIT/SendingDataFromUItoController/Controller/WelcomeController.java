package com.BikkadIT.SendingDataFromUItoController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcomeMsg")
	public String welcomeMsg(@RequestParam  String name,Model model) {
	
		String msg="Hii "+name+" Welcome To BikkadIT";
		System.out.println(msg);       // Here data is coming from Front end & print on Console
		
		model.addAttribute("MSG", msg);
		return "welcome";        // Here data is sent from Controller to Front end on browser.
		

}
}

// First Run Program as SpringBoot App
// Then hit url http://localhost:9090/welcomeMsg?name=Santosh on browser 
//  Then Handler Mapper send UI request to Controller
// Then @Requestparam Annotation  read Query parameter value from UI 
// In this way, data is sent from UI to Controller

// In above program, Model is used to send data from Controller to UI