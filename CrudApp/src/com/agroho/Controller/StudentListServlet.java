package com.agroho.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agroho.Model.Student;
import com.agroho.Service.StudentService;

/**
 * Servlet implementation class StudentListServlet
 */
@WebServlet("/students")
public class StudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		StudentService sService  = new StudentService();
		ArrayList<Student> sList = sService.getAllStudent();
		request.setAttribute("Student_list", sList);
//		PrintWriter out = response.getWriter();
//		for(Student s: sList){
//			
//			out.println(s.getStudentName());
//		}
//		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
//		
//		response.sendRedirect("index.jsp");
		//writer.println("All Students");
	}

}
