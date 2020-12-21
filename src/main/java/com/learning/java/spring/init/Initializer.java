package com.learning.java.spring.init;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.java.spring.bean.Person;
import com.learning.java.spring.config.ApplicationConfiguration;

public class Initializer {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(ApplicationConfiguration.class);
		applicationContext.refresh();

		Person person = (Person) applicationContext.getBean("getPersonBean");
		System.out.println(person.toString());

		Person person1 = (Person) applicationContext.getBean("getSantheepPersonBean");
		person1.setName("Santheep Kumar");
		System.out.println(person1.toString());

		Person person2 = applicationContext.getBean(Person.class);
		System.out.println(person2.toString());

		applicationContext.close();
	}
}
