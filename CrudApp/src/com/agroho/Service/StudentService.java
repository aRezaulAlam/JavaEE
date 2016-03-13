package com.agroho.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import com.agroho.Model.Student;

public class StudentService {
	
	HashMap<Integer, Student> studentMap = new HashMap<Integer,Student>();
	ArrayList<Student> students = new ArrayList< Student>();
	
	public StudentService(){


//		System.out.println("-------- MySQL JDBC Connection Testing ------------");
//
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println("Where is your MySQL JDBC Driver?");
//			e.printStackTrace();
//			
//		}
//
//		System.out.println("MySQL JDBC Driver Registered!");
//		Connection connection = null;
//
//		try {
//			connection = DriverManager
//			.getConnection("jdbc:mysql://localhost/dev","root", "");
//
//		} catch (SQLException e) {
//			System.out.println("Connection Failed! Check output console");
//			e.printStackTrace();
//			
//		}
//
//		if (connection != null) {
//			System.out.println("You made it, take control your database now!");
//		} else {
//			System.out.println("Failed to make connection!");
//		}
//	  
	}
	
	public ArrayList<Student> getAllStudent(){
		
		HashMap<Integer, Student> studentListMap = getStudent();
		students = getStudentList(studentListMap);
		
		return students;
	}
	

	private ArrayList<Student> getStudentList(HashMap<Integer, Student> m) {
		//ArrayList<Student> students = new ArrayList<Student>();
		
		Set<Entry<Integer, Student>> s = m.entrySet();

        Iterator<Entry<Integer, Student>> itr = s.iterator();

        while (itr.hasNext()){

            Map.Entry student = (Map.Entry)itr.next();

           // String key = (String)student.getKey();
            Student value = (Student) student.getValue();

            students.add(value);
        }
        
        return students;
		
	}

	private HashMap<Integer, Student> getStudent(){
		Student s1 = new Student();
		s1.setStudentId(12);
		s1.setStudentName("Akib");
		s1.setStudentEmail("akib@mail.com");
		s1.setStudentDepartment("CSE");
		
		Student s2 = new Student();
		s2.setStudentId(13);
		s2.setStudentName("Rezaul");
		s2.setStudentEmail("rezaul@mail.com");
		s2.setStudentDepartment("EEE");
		
		Student s3 = new Student();
		s3.setStudentId(14);
		s3.setStudentName("Nahid");
		s3.setStudentEmail("nahid@mail.com");
		s3.setStudentDepartment("BBA");
		
		studentMap.put(s1.getStudentId(), s1);
		studentMap.put(s2.getStudentId(), s2);
		studentMap.put(s3.getStudentId(), s3);
		return studentMap;
		
	}
	
}


