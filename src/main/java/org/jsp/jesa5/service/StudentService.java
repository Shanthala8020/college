package org.jsp.jesa5.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.jsp.jesa5.dao.CourseDao;
import org.jsp.jesa5.dao.StudentDao;
import org.jsp.jesa5.dto.Course;
import org.jsp.jesa5.dto.Student;
import org.jsp.jesa5.helper.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;

	@Autowired
	CourseDao courseDao;

	public ModelAndView signup(Student student, String date) {
		ModelAndView view = new ModelAndView();
		if (studentDao.fetch(student.getEmail()) == null && studentDao.fetch(student.getMobile()) == null) {
			Date dob = Date.valueOf(date);
			student.setDob(dob);
			int age = Period.between(dob.toLocalDate(), LocalDate.now()).getYears();
			student.setAge(age);

			studentDao.save(student);
			view.setViewName("Home");
			view.addObject("success", "Student Account created Success");
		} else {
			view.setViewName("StudentSignup");
			view.addObject("fail", "Email or Phone already Exists");
		}
		return view;
	}

	public ModelAndView login(Login login, HttpSession session) {
		ModelAndView view = new ModelAndView();
		Student student = studentDao.fetch(login.getEmail());
		if (student == null) {
			view.setViewName("StudentLogin");
			view.addObject("fail", "Email Wrong");
		} else {
			if (login.getPassword().equals(student.getPassword())) {
				session.setAttribute("student", "student");
				view.setViewName("StudentHome");
				view.addObject("success", "Login Success");
			} else {
				view.setViewName("StudentLogin");
				view.addObject("fail", "Password Wrong");
			}
		}

		return view;
	}

	public ModelAndView fetchCourse() {
		ModelAndView view = new ModelAndView();

		List<Course> list = courseDao.fetch();
		if (list.isEmpty()) {
			view.setViewName("StudentHome");
			view.addObject("fail", "No Courses to Opt");
		}
		else {
			view.setViewName("/EnrollCourse");
			view.addObject("list", list);
		}
		return view;
	}

}
