package org.jsp.jesa5.dao;

import org.jsp.jesa5.dto.Faculty;
import org.jsp.jesa5.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FacultyDao {
	@Autowired
	FacultyRepository repository;

	public void save(Faculty faculty) {
		repository.save(faculty);
	}

	public Faculty fetch(String email) {
		return repository.findByEmail(email);
	}

	public Faculty fetch(long mobile) {
		return repository.findByMobile(mobile);
	}
}
