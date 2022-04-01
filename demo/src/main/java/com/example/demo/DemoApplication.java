package com.example.demo;

import com.example.demo.order.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
public List<Order> hello(){
	return List.of(
			new Order(
				1L,
				"anas",
				30,
				200,
					130

			),

			new Order(
					2L,
					"farhan",
					10,
					300,
					255
			),

			new Order(
					3L,
					"hamzeh",
					10,
					500,
					425


			)

	);
}
}
