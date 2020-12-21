package com.learning.java.spring.bean;

public class Detail {

	String age;
	String gender;
	String martialStatus;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	@Override
	public String toString() {
		return "Detail [age=" + age + ", gender=" + gender + ", martialStatus=" + martialStatus + "]";
	}

}
