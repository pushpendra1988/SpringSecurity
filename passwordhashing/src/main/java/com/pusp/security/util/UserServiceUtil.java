package com.pusp.security.util;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
public class UserServiceUtil {
	public static String enCodedPassword(String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.encode(password);
		
	}
	
	public static boolean passwordCheck(String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.matches(password, "$2a$10$ozBaDjFAottftK8IyJuqm.aLof25OYlojThz9u/ZcdWYHKC1FH/SW");
		
	}

}
