package com.aastha.demo;

import com.aastha.demo.DependencyInjection.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		Student student = context.getBean(Student.class);
//		student.setName("Aastha");
//		student.setAge(32);
//		Student student = new Student(21, "Aastha");
//
//		System.out.println(student.getAge());
//		System.out.println(student.getName());

		OrderService orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
	}
}
