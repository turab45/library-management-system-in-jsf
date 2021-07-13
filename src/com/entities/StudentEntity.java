package com.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity extends AbstractEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Integer id;
	@Column(name = "roll_no")
	private String rollNo;
	@Column(name = "name")
	private String name;
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	@Column(name = "contact")
	private String contact;
	@Column(name = "email")
	private String email;
	@OneToMany
	@JoinColumn(name = "student")
	private List<IssueEntity> allIssuedBooks;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<IssueEntity> getAllIssuedBooks() {
		return allIssuedBooks;
	}
	public void setAllIssuedBooks(List<IssueEntity> allIssuedBooks) {
		this.allIssuedBooks = allIssuedBooks;
	}
	
	
	
	
}
