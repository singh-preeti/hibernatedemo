package com.tusk;
// plain old java object(POJO)
import javax.persistence.Column;
//import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int EmpId;
	@Column
	private String Empname;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public Employee(int empId, String empname) {
		super();
		EmpId = empId;
		Empname = empname;
	}
	
	

}
