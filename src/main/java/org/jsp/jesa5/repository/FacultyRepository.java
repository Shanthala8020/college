package org.jsp.jesa5.repository;

import org.jsp.jesa5.dto.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

	Faculty findByEmail(String email);

	Faculty findByMobile(long mobile);

}
