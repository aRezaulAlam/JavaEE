<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList , com.agroho.Model.Student"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="css/project.css" rel="stylesheet" media="screen">
    <title>Bootstrap Practice</title>
</head>
<body>



<div class="container">
    <div class="row">
        <div class="col-md-8">


           <div class="btn-group">
  <button type="button" class="btn btn-default">All Students</button><span>
  <button type="button" class="btn btn-default">Student Details</button><span>
  <button type="button" class="btn btn-default">Add Student</button><span>
  <button type="button" class="btn btn-default">Edit Student</button><span>
  <button type="button" class="btn btn-default">Delete Student</button><span>
  

			</div>

        </div>


    </div>
    <div class="row">
        
        <div class="col-md-8">
          <table class="table table-hover">
			  <thead>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Department</th>
      </tr>
    </thead>
    <tbody>
    
    <%

try{
	
	ArrayList<Student> sList = new ArrayList<Student>();
	sList = (ArrayList<Student>)request.getAttribute("Student_list");

	for(Student s : sList){
		
		%>
		<tr>
        	<td><%=s.getStudentId() %></td>
        	<td><%=s.getStudentName() %></td>
        	<td><%=s.getStudentEmail() %></td>
        	<td><%=s.getStudentDepartment() %></td>
        </tr>
		<% 
	}
	
} catch(Exception e){
	
}


%>
      
     
    </tbody>
			</table>

        </div>
    </div>
</div>
<div class="container">
    <div class="row">
       
    </div>
</div>


<script type="text/javascript" src="//code.jquery.com/jquery.js"></script>
<script type="text/javascript" src="script/bootstrap.min.js"></script>
<script type="text/javascript" src="script/project.js"></script>

</body> <br><br>




<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-4">&copy; 2013</div>
            <div class="col-md-4">
                <ul class="nav nav-pills">
                    <li class="active"><a href="http://www.agroho.com">Copyright agroho.com</a></li>
                   
                </ul>
            </div>
           
        </div>
    </div>
</footer>
</html>