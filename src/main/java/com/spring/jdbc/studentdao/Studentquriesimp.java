package com.spring.jdbc.studentdao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.springjdbc.Student;

public class Studentquriesimp implements Studentqueries {
	
	private JdbcTemplate Jdbctmp;

	public int insert(Student student) {
		
        //insert query
        
        String query="insert into student (name,mobile_no,city) values(?,?,?)";
        
        int result = this.Jdbctmp.update(query,student.getName(),student.getMobile_num(),student.getCity());
        
        return result;
		
	}
	
	public int change(Student student) {
		// update query 
		
		String query="update student set name=? , city=? where mobile_no=?";
		
		int result = Jdbctmp.update(query,student.getName(),student.getCity(),student.getMobile_num());
		
		return result;
	}
	
	public int delete(String stud_id) {
		
		//delete query
		
		String query="delete from student where mobile_no=?";
		
		int result=Jdbctmp.update(query,stud_id);
		
		return result;
	}
	
	public Student selectone(String mob_no) {
		
		String query="select * from student where mobile_no=?";
		
		Student stud = Jdbctmp.queryForObject(query,new RowMapper() {
			
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException{
				Student s1=new Student();
				s1.setName(rs.getString(1));
				s1.setMobile_num(rs.getString(2));
				s1.setCity(rs.getString(3));
				
				return s1;
			}
			
		},mob_no);
		
		return stud;
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
