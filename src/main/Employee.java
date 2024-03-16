package main;

public class Employee {

	int empid;
	
	String name;
	
	String gender;
	
	double salary;

	public Employee(int empid, String name, String gender, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}

	
	
	
}
