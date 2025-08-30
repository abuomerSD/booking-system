package com.eltayeb.bookingsystem;

import com.eltayeb.bookingsystem.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookingsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingsystemApplication.class, args);
        User u = new User();
	}

}
