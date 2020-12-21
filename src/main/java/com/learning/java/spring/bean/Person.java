package com.learning.java.spring.bean;

public class Person {

	String name;

	Detail detail;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Detail getDetail() {
		return detail;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", detail=" + detail + "]";
	}

}
