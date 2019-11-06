package com.lti.Hibernate_Maven.Hibernate_Proj1;

public class Employeee {

	private int id;
	private String empName;
	private String Branch;
	public int getId(){
		return id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getbranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		this.Branch = branch;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employeee(int id, String empName, String branch) {
		super();
		this.id = id;
		this.empName = empName;
		Branch = branch;
	}
	@Override
	public String toString() {
		return "Employeee [id=" + id + ", empName=" + empName + ", Branch=" + Branch + "]";
	}
	
	
}
