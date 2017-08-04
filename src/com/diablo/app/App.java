package com.diablo.app;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diablo.Model.Student;
import com.diablo.dao.StudentDaoImpl;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		StudentDaoImpl st = (StudentDaoImpl)ctx.getBean("dao");
		List<Student> list=st.getStudents();  
        
	    for(Student e:list)  
	     System.out.println(e);  

	}

}
