package Emp;

public class Employee {
	int empno;
	String ename;
	String job;
	int mgr;
	String date;
	double salary;
	double comm;
	int deptno;

	public Employee(int a, String b, String c, int d, String e, double f, double g, int h) {
		empno = a;
		ename = b;
		job = c;
		mgr = d;
		date = e;
		salary = f;
		comm = g;
		deptno = h;
	}

	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public String getJob() {
		return job;
	}

	public int getMgr() {
		return mgr;
	}

	public String getDate() {
		return date;
	}

	public double getSalary() {
		return salary;
	}

	public double getComm() {
		return comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

}

