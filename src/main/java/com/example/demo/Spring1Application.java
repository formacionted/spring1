package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.beans.Employee;

/**
 * En esta aplicacion mostramos cómo llevar a cabo la configuración XML de los beans en Spring Boot
 * @author alan.sastre
 */
@SpringBootApplication
@ImportResource({ "classpath*:applicationContext.xml" })
public class Spring1Application {

	public static void main(String[] args) {
//		 SpringApplication.run(Spring1Application.class, args);
		ApplicationContext context = SpringApplication.run(Spring1Application.class, args);
		
		Employee employee1 = (Employee) context.getBean("employee1");
		employee1.showDetails();
	}

}
