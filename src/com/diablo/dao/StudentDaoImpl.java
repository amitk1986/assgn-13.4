package com.diablo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;





import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.diablo.Model.Student;

public class StudentDaoImpl extends JdbcDaoSupport{
	
	
	public List<Student> getStudents(){  
		 return getJdbcTemplate().query("select * from students",new ResultSetExtractor<List<Student>>(){  
		    @Override  
		     public List<Student> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<Student> list=new ArrayList<Student>();  
		        while(rs.next()){  
		        	Student e=new Student(rs.getInt(1),rs.getString(2));  
		         
		        list.add(e);  
		        }  
		        return list;  
		        }  
		    });  
		  }  
}
