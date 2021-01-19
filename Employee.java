package net.javaguides.springboot.cruderestfulwebservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="email_id")
	private String emailid;
	
	
	
	
	public Employee() {
		super();
	}

	public Employee(long id, String firstname, String lastname, String emailid) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
}
