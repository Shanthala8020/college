package org.jsp.jesa5.helper;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Login {
	String email;
	String password;
}
