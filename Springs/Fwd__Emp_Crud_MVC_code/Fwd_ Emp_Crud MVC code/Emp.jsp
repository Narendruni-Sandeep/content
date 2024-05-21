<%@ page import = "java.io.*,java.util.*,Emp.*"%>
 <html>
   <head>
      <title>Employee details</title>
      <style>
      fieldset {
    font-family:  Georgia, serif;
    border: 2px solid #1F497D;
    border-radius: 5px;
    padding: 15px;
}

fieldset legend {
    background: rgba(255, 0, 0, 1);
    color: #fff;
    padding: 5px 10px ;
    font-size: 32px;
    border-radius: 5px;
    box-shadow: 0 0 0 5px #ddd;
    margin-left: 20px;
}
      </style>
   </head>
   <body>
     <form action="/action_page.php">
     <section style="margin: 10px;">
     <fieldset style="border-radius: 5px; padding: 5px; min-height:150px;">
     <legend>Employee details:</legend>
<%
		List<Employee> elist=(List<Employee>)request.getAttribute("data");
		for(Employee emp:elist){
%>	
			<label for="empno">Employee number:</label>
  			<input type="text"  value=<%=emp.getEmpno()%>><br><br>
  			<label for="empname">Employee name:</label>
  			<input type="text"  value=<%=emp.getEname() %>><br><br>
  			<label for="empname">Employee job:</label>
  			<input type="text"  value=<%=emp.getJob() %>><br><br>
  			<label for="empname">Manager ID:</label>
  			<input type="text"  value=<%=emp.getMgr() %>><br><br>
  			<label for="empname">Hire date:</label>
  			<input type="text"  value=<%=emp.getDate() %>><br><br>
  			<label for="empname">Salary:</label>
  			<input type="text"  value=<%=emp.getSalary() %>><br><br>
  			<label for="empname">commission:</label>
  			<input type="text"  value=<%=emp.getComm() %>><br><br>
  			<label for="empname">Department no:</label>
  			<input type="text"  value=<%=emp.getDeptno() %>><br><br>
  			
  			
<%
		}
%>
      </fieldset>
      </form>
   </body>
</html>