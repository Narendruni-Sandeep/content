package Emp;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Emp_Search extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = null;

		try {
			QueryClass qc = new QueryClass();
			String x = request.getParameter("empno");
			int y = Integer.parseInt(x);
			List<Employee> dt = qc.findRecord(y);
			request.setAttribute("data", dt);
			rd = request.getRequestDispatcher("Emp.jsp");
			rd.forward(request, response);
		} catch (Exception e) {

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
