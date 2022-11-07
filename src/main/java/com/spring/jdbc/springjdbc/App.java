package com.spring.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.studentdao.Studentqueries;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("my program is started");
        
        ApplicationContext con= new AnnotationConfigApplicationContext(JavaConfig.class);
        
        
        Studentqueries query1 = con.getBean("getQueries",Studentqueries.class);
        
        Student s1= new Student();
        s1.setName("bob");
        s1.setMobile_num("9652321452");
        s1.setCity("los angles");
        
        int result = query1.insert(s1);
        
        System.out.println("the inserted row is "+ result);
        
    }
}
