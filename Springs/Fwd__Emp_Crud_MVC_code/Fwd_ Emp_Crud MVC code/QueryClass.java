package Emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueryClass {
	Connection conn = null;
	Statement st = null;
	String qry, cs;
	ResultSet rst;
	static int count = 1;
	Scanner sc = new Scanner(System.in);

	public void connection() {
		try {
			Class.forName("org.postgresql.Driver");
			cs = "jdbc:postgresql://192.168.110.48:5432/training?user=plf_freshers_admin&password=pff123";
			conn = DriverManager.getConnection(cs);
			st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			qry = "select * from emp10";
			rst = st.executeQuery(qry);
			rst.absolute(count);

		} catch (ClassNotFoundException cex) {
			System.out.println(cex.getMessage());
		} catch (SQLException sqex) {
			System.out.println(sqex.getMessage());
		}
	}

	public List<Employee> fetchFirstRecord() {
		this.connection();
		List<Employee> lst = new ArrayList<>();
		try {

			rst.absolute(1);
			count = 1;
			int empno = rst.getInt(1);
			String ename = rst.getString(2);
			String job = rst.getString(3);
			int mgr = rst.getInt(4);
			String hiredate = rst.getString(5);
			double salary = rst.getDouble(6);
			double comm = rst.getDouble(7);
			int deptno = rst.getInt(8);

			Employee e1 = new Employee(empno, ename, job, mgr, hiredate, salary, comm, deptno);
			lst.add(e1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}

	public void fetchRecord() {
		this.connection();
		try {

			rst.absolute(count);
			int empno = rst.getInt(1);
			String ename = rst.getString(2);
			String job = rst.getString(3);
			int mgr = rst.getInt(4);
			String hiredate = rst.getString(5);
			double salary = rst.getDouble(6);
			double comm = rst.getDouble(7);
			int deptno = rst.getInt(8);

			System.out.println("======First Record Details======");
			System.out.println("Employee number:" + empno);
			System.out.println("Employee name:" + ename);
			System.out.println("Designation:" + job);
			System.out.println("ManagerID:" + mgr);
			System.out.println("Hire Date:" + hiredate);
			System.out.println("Salary:" + salary);
			System.out.println("Commission:" + comm);
			System.out.println("Deptno:" + deptno);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Employee> fetchNextRecord() {
		this.connection();
		List<Employee> lst = new ArrayList<>();
		try {
			count++;
			rst.absolute(count);
			int empno = rst.getInt(1);
			String ename = rst.getString(2);
			String job = rst.getString(3);
			int mgr = rst.getInt(4);
			String hiredate = rst.getString(5);
			double salary = rst.getDouble(6);
			double comm = rst.getDouble(7);
			int deptno = rst.getInt(8);

			Employee e1 = new Employee(empno, ename, job, mgr, hiredate, salary, comm, deptno);
			lst.add(e1);

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}

	public List<Employee> fetchPreviousRecord() {
		this.connection();
		List<Employee> lst = new ArrayList<>();
		try {
			count--;
			rst.absolute(count);

			int empno = rst.getInt(1);
			String ename = rst.getString(2);
			String job = rst.getString(3);
			int mgr = rst.getInt(4);
			String hiredate = rst.getString(5);
			double salary = rst.getDouble(6);
			double comm = rst.getDouble(7);
			int deptno = rst.getInt(8);

			Employee e1 = new Employee(empno, ename, job, mgr, hiredate, salary, comm, deptno);
			lst.add(e1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}

	public List<Employee> fetchLastRecord() {
		this.connection();
		List<Employee> lst = new ArrayList<>();
		try {
			rst.absolute(-1);
			count = -1;
			int empno = rst.getInt(1);
			String ename = rst.getString(2);
			String job = rst.getString(3);
			int mgr = rst.getInt(4);
			String hiredate = rst.getString(5);
			double salary = rst.getDouble(6);
			double comm = rst.getDouble(7);
			int deptno = rst.getInt(8);

			Employee e1 = new Employee(empno, ename, job, mgr, hiredate, salary, comm, deptno);
			lst.add(e1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}

	public List<Employee> addRecord(int a, String b, String c, int d, int e, int f, int g) {
		this.connection();
		List<Employee> lst = new ArrayList<>();
		try {
			rst.absolute(-1);
			rst.moveToInsertRow();
			rst.updateInt(1, a);
			rst.updateString(2, b);
			rst.updateString(3, c);
			rst.updateInt(4, d);
			rst.updateInt(6, e);
			rst.updateInt(7, f);
			rst.updateInt(8, g);
			rst.insertRow();

			rst.absolute(-1);

			int empno = rst.getInt(1);
			String ename = rst.getString(2);
			String job = rst.getString(3);
			int mgr = rst.getInt(4);
			String hiredate = rst.getString(5);
			double salary = rst.getDouble(6);
			double comm = rst.getDouble(7);
			int deptno = rst.getInt(8);

			Employee e1 = new Employee(empno, ename, job, mgr, hiredate, salary, comm, deptno);
			lst.add(e1);

		} catch (Exception i) {
			System.out.println(i.getMessage());
		}
		return lst;
	}

	public void editRecord() {
		this.connection();
		try {
			System.out.println("Enter the record number you would like to update:");
			int x = sc.nextInt();
			count = x;
			rst.absolute(x);
			rst.updateString(1, "2634");
			rst.updateRow();
			this.fetchRecord();
			System.out.println("Record has been Updated");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteRecord(int x) {
		this.connection();
		try {

			rst.absolute(1);

			while (rst.next()) {
				int b = rst.getInt(1);
				if (b == x) {
					rst.deleteRow();
					break;
				}
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Employee> findRecord(int z) {
		this.connection();
		int x;
		List<Employee> lst = new ArrayList<>();
		try {
			count = 1;
			rst.absolute(1);
			x = rst.getInt(1);
			if (x == z) {
				int empno = rst.getInt(1);
				String ename = rst.getString(2);
				String job = rst.getString(3);
				int mgr = rst.getInt(4);
				String hiredate = rst.getString(5);
				double salary = rst.getDouble(6);
				double comm = rst.getDouble(7);
				int deptno = rst.getInt(8);

				Employee e1 = new Employee(empno, ename, job, mgr, hiredate, salary, comm, deptno);
				lst.add(e1);
			} else {
				while (rst.next()) {
					x = rst.getInt(1);
					if (x == z) {
						int empno = rst.getInt(1);
						String ename = rst.getString(2);
						String job = rst.getString(3);
						int mgr = rst.getInt(4);
						String hiredate = rst.getString(5);
						double salary = rst.getDouble(6);
						double comm = rst.getDouble(7);
						int deptno = rst.getInt(8);

						Employee e1 = new Employee(empno, ename, job, mgr, hiredate, salary, comm, deptno);
						lst.add(e1);

						break;
					}
					count++;
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lst;
	}

	public void exit() {
		this.connection();
		try {
			rst.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
