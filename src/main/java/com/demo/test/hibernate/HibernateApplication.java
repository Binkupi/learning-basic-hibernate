package com.demo.test.hibernate;

import com.demo.test.hibernate.daos.UserRepository;
import com.demo.test.hibernate.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}
	@Autowired
	UserRepository userRepository;
	@Autowired
	PasswordEncoder passwordEncoder;

//	@Override
//	public void run(String... args) throws Exception {
//		// Khi chương trình chạy
//		// Insert vào csdl một user.
//		User user = new User();
//		user.setUsername("loda");
//		user.setPassword(passwordEncoder.encode("loda"));
//		userRepository.save(user);
//		System.out.println(user);
//	}

}
