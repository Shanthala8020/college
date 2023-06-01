package org.jsp.jesa5.dao;

import org.jsp.jesa5.dto.Student;
import org.jsp.jesa5.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository repository;

	public void save(Student student) {
		repository.save(student);
	}

	public Student fetch(String email) {
		return repository.findByEmail(email);
	}

	public Student fetch(long mobile) {
		return repository.findByMobile(mobile);
	}

}
