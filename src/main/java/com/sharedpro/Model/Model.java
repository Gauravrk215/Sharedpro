package com.sharedpro.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Model {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Employee employee;
	
	@NotNull(message = "please fill")
	private String Professor;
	
	@NotNull(message = "please fill")
	private String Department;
	
	@NotNull(message = "please fill")
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int Department_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getProfessor() {
		return Professor;
	}

	public void setProfessor(String professor) {
		Professor = professor;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public int getDepartment_id() {
		return Department_id;
	}

	public void setDepartment_id(int department_id) {
		Department_id = department_id;
	}

	public Model(int id, Employee employee, @NotNull(message = "please fill") String professor,
			@NotNull(message = "please fill") String department, @NotNull(message = "please fill") int department_id) {
		super();
		this.id = id;
		this.employee = employee;
		Professor = professor;
		Department = department;
		Department_id = department_id;
	}

	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	

	
	
	
	

	
	

}
