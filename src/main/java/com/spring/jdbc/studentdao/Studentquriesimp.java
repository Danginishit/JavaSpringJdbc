package com.spring.jdbc.studentdao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.springjdbc.Student;

public class Studentquriesimp implements Studentqueries {
	
	private JdbcTemplate Jdbctmp;

	public int insert(Student student) {
		
        //insert query
        
        String query="insert into student (name,mobile_no,city) values(?,?,?)";
        
        int result = this.Jdbctmp.update(query,student.getName(),student.getMobile_num(),student.getCity());
        
        return result;
		
	}

	public Studentquriesimp(JdbcTemplate jdbctmp) {
		super();
		Jdbctmp = jdbctmp;
	}

	public JdbcTemplate getJdbctmp() {
		return Jdbctmp;
	}

	public void setJdbctmp(JdbcTemplate jdbctmp) {
		Jdbctmp = jdbctmp;
	}

}
