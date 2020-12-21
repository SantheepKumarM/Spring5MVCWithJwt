package com.learning.java.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.learning.java.spring.bean.Detail;
import com.learning.java.spring.bean.Person;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.learning.java")
public class ApplicationConfiguration {

	@Bean(name = { "getPersonBean", "getSantheepPersonBean" })
	@Scope("prototype")
	public Person getPersonBean() {
		Person person = new Person();
		person.setName("santheep");
		person.setDetail(getDetailBean());
		return person;
	}

	@Bean(name = { "detailBean" })
	public Detail getDetailBean() {
		Detail re = new Detail();
		re.setAge("26");
		re.setGender("M");
		re.setMartialStatus("unmarried");
		return re;
	}
}
