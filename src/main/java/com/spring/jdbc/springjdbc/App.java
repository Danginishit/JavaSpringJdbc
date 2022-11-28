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
        
//        Student s1= new Student();
//        s1.setName("bob");
//        s1.setMobile_num("9652321452");
//        s1.setCity("los angles");
//        
//        int result = query1.insert(s1);

        
//        Student s2= new Student();
//        s2.setName("marley");
//        s2.setCity("los bangles");
//        s2.setMobile_num("9652321452");
//        
//        int result = query1.change(s2);
        
//        int result=query1.delete("9652321452");
        
        Student result=query1.selectone("9652321452");
        
        System.out.println("updated queries are "+result);
        
    }
}
