package com.spring.jdbc.springjdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;

import com.spring.jdbc.studentdao.Studentquriesimp;

@Configuration
public class JavaConfig {
	
	@Bean
	public JdbcTemplate getJdbcTemp() {
		return new JdbcTemplate(getConnection());
	}

	@Bean
	public DriverManagerDataSource getConnection() {
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/springjdbc","root","");
	}
	
	@Bean
	public Studentquriesimp getQueries() {
		return new Studentquriesimp(getJdbcTemp());
	}
}

