package com.uncleYar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uncleYar.entities.Teachers;
import com.uncleYar.repositories.TeachersRepository;

@RestController
@RequestMapping("/api")
public class TeachersApi {

@Autowired
TeachersRepository teachersRepo;

@GetMapping("/teachers_list")
    public Iterable<Teachers> getTreacherList() {
        return teachersRepo.findAll();
    }

}
