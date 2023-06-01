package org.jsp.jesa5.dao;

import java.util.List;

import org.jsp.jesa5.dto.Course;
import org.jsp.jesa5.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDao {
	@Autowired
	CourseRepository repository;

	public void add(Course course) {
		repository.save(course);
	}

	public Course fetch(String name) {
		return repository.findByName(name);
	}

	public List<Course> fetch() {
		return repository.findAll();
	}

}
