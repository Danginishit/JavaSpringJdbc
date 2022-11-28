package com.spring.jdbc.studentdao;

import com.spring.jdbc.springjdbc.Student;

public interface Studentqueries {

	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(String mobile_num);
	
	public Student selectone(String mob_no);
	
}
