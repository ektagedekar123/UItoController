package com.BikkadIT.SendingDataFromUItoController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdditionController {
    
	@GetMapping("/printingValue/{a}/Additon") // We are hitting url here is http://localhost:9090/printingValue/40/Additon
	public String printValue(@PathVariable int a, Model model)
	{
	
	String msg="The value of A is "+a;
	System.out.println(a);
	
	model.addAttribute("MSG", msg);
	return "print";
   }
	
	@GetMapping("/AdditionOfNos./{a}/{b}") // We are hitting url here is http://localhost:9090/AdditionOfNos./10/20
	public String addition(@PathVariable int a, @PathVariable int b, Model model)
	{
		int c=a+b;
		String msg="Addition of a & b is "+c;
		
		model.addAttribute("ADDITION", msg);
		return "add";
	}
}
// PathParameter is used to send data from UI to Controller & it will represent data in URL directley without key
// Path Parameters can present any where in the URL
// Path Parameter will start with / symbol and will be seperated by / symbol only
// To read Path Parameter values we will use @PathVariable annotation in controller

//Note: Our console shows the server when we run program
// we can change our server port no. like 9090,4040, etc
// But by default server port no. is 8080