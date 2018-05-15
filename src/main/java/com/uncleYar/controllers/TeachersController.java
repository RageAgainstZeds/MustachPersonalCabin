package com.uncleYar.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uncleYar.repositories.TeachersRepository;

@Controller
@RequestMapping("/teachers")
public class TeachersController {
	@Autowired
	TeachersRepository teachersRepo;
	
	@GetMapping
	public ModelAndView teachersPage() {
		Map<String, String> model = new HashMap<>();
		
		model.put("teachersCount", String.valueOf(teachersRepo.count()));
		
		return new ModelAndView("teachers", model);
	}
}
