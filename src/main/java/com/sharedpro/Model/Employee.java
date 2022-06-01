package com.sharedpro.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.aspectj.apache.bcel.ExceptionConstants;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull(message = "Can't be empty")
	private String name;
	
	@NotNull(message = "Enter valid date of birth")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "DD/MM/yyyy")
	private Date birthdate;
	
	@NotNull(message = "Can't be empty")
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee(int id, @NotNull(message = "Can't be empty") String name,
			@NotNull(message = "Enter valid date of birth") Date birthdate,
			@NotNull(message = "Can't be empty") String city) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.city = city;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	

}
