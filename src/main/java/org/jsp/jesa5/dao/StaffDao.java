package org.jsp.jesa5.dao;

import org.jsp.jesa5.dto.Staff;
import org.jsp.jesa5.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StaffDao {
	@Autowired
	StaffRepository repository;

	public void save(Staff staff) {
		repository.save(staff);
	}

	public Staff fetch(String email) {
		return repository.findByEmail(email);
	}

	public Staff fetch(long mobile) {
		return repository.findByMobile(mobile);
	}
}
