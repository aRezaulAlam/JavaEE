package com.agroho.Model;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentEmail;
	private String studentDepartment;
	
	public Student(){
		
	}
	
	public Student(int studentId, String studentName, String studentEmail, String studentDepartment) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentDepartment = studentDepartment;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentDepartment() {
		return studentDepartment;
	}
	public void setStudentDepartment(String string) {
		this.studentDepartment = string;
	}
	
	
	

}
