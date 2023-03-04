package com.BikkadIT.SendingDataFromUItoController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
	
	@GetMapping("/course")
	public ModelAndView getCourseDetails(@RequestParam String cname, @RequestParam String tname) {

		String msg= cname +" new Batch Is Starting from 1 feb 2023 by "+tname;
		
		System.out.println(msg); // Here when we hit url on Browser, data coming from UI & print on Console 
		
		ModelAndView mav=new ModelAndView(); // Here ModelAndView is used to send data from Controller to UI
		mav.addObject("COURSE", msg);
		mav.setViewName("course");
		
		return mav;     // Here data is sending from Controller to UI on Browser

	}

}

// Here we are hitting url http://localhost:9090/course?cname=Java%20Developement&tname=Rohit on browser
// Query parameters will be seperated by & symbol while writing url on browser