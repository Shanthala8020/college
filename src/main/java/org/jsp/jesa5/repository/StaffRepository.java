package org.jsp.jesa5.repository;

import org.jsp.jesa5.dto.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

	Staff findByEmail(String email);

	Staff findByMobile(long mobile);

}
