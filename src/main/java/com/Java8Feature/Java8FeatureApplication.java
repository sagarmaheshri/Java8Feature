package com.Java8Feature;

import com.Java8Feature.model.Employee;
import com.Java8Feature.model.EmployeeDataBase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Java8FeatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8FeatureApplication.class, args);
		System.out.println("Welcome to Java 8 Features Application");

		List<Employee> employees= EmployeeDataBase.getAllEmployees();

		//forEach example
		employees.forEach(employee -> System.out.println("Emp Name " + employee.getName() + " : " + "Emp Salary "+employee.getSalary()));

		//Steam of employees objects
		employees.stream().forEach(System.out::println);



	}

}
