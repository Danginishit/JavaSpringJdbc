package com.spring.jdbc.springjdbc;

public class Student {
	
	private int id;
	private String name;
	private String mobile_num;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile_num=" + mobile_num + ", city=" + city + "]";
	}
//	public Student(int id, String name, String mobile_num, String city) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.mobile_num = mobile_num;
//		this.city = city;
//	}
	
}
