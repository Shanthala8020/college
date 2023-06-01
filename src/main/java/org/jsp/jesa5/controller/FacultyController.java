package org.jsp.jesa5.controller;

import org.jsp.jesa5.dto.Faculty;
import org.jsp.jesa5.helper.Login;
import org.jsp.jesa5.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
public class FacultyController {
	@Autowired
	FacultyService facultyService;

	@PostMapping("signup")
	public ModelAndView signup(@ModelAttribute Faculty faculty, @RequestParam String date) {
		return facultyService.signup(faculty, date);
	}

	@PostMapping("login")
	public ModelAndView login(@ModelAttribute Login login, HttpSession session) {
		return facultyService.login(login, session);
	}
}
