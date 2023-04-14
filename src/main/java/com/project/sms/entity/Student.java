package com.project.sms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="Student")
public class Student {
    	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String firstName;
	private String secondName;
	private String address;
	private String phNo;
	private String email;

	public Student(String firstName, String secondName, String address, String phNo, String email) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.address = address;
		this.phNo = phNo;
		this.email = email;
	}

	public Student() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", firstName=" + firstName + ", secondName=" + secondName + ", address=" + address
				+ ", phNo=" + phNo + ", email=" + email + "]";
	}

}
