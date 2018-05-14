package com.uncleYar.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uncleYar.entities.Teachers;
import com.uncleYar.repositories.TeachersRepository;

@Controller
@RequestMapping("/")
class HomeController {
	
	@Autowired
	TeachersRepository teachersRepo;
	
	@GetMapping
	public ModelAndView home() {
		Map<String, String> model = new HashMap<>();
		
		Teachers teachers = new Teachers();
		
		model.put("teachersCount", String.valueOf(teachersRepo.count()));
		
		return new ModelAndView("index", model);
	}
}	
