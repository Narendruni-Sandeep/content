package Emp;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Emp_Add extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = null;

		try {
			QueryClass qc = new QueryClass();
			String a = request.getParameter("empno");
			int b = Integer.parseInt(a);
			String c = request.getParameter("ename");
			String d = request.getParameter("job");
			String e = request.getParameter("mgr");
			int f = Integer.parseInt(e);
			String g = request.getParameter("sal");
			int h = Integer.parseInt(g);
			String i = request.getParameter("comm");
			int j = Integer.parseInt(i);
			String k = request.getParameter("deptno");
			int l = Integer.parseInt(k);

			List<Employee> dt = qc.addRecord(b, c, d, f, h, j, l);
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