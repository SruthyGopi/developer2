package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "DEVELOPER")
public class Developer {
	@Id  
	//defining id as column name  
	 @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	//defining name as column name  
	@Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private String email;

    @Column
    private String skills;

	public Developer() {
		super();
	}

	public Developer(Long id, String firstname, String lastname, String email, String skills) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.skills = skills;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	  
	

}
