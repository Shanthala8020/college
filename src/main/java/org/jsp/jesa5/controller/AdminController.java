package org.jsp.jesa5.controller;

import org.jsp.jesa5.dto.Course;
import org.jsp.jesa5.dto.Stream;
import org.jsp.jesa5.helper.Login;
import org.jsp.jesa5.service.AdminService;
import org.jsp.jesa5.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("admin")
public class AdminController {

	@Autowired
	AdminService adminService;

	@Autowired
	CourseService courseService;

	@PostMapping("login")
	public ModelAndView login(@ModelAttribute Login login, HttpSession session) {
		return adminService.login(login, session);
	}

	@PostMapping("course")
	public ModelAndView addCourse(@ModelAttribute Course course) {
		return courseService.add(course);
	}

	@GetMapping("stream")
	public ModelAndView checkCourse() {
		return courseService.checkCourse();
	}

	@PostMapping("stream")
	public ModelAndView saveStream(@ModelAttribute Stream stream, @RequestParam String courseName) {
		return courseService.saveStream(stream, courseName);
	}
}
