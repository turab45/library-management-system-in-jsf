package com.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "issue")
public class IssueEntity extends AbstractEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "issue_id")
	private Integer id;
	@ManyToOne
	private BookEntity book;
	@ManyToOne
	private StudentEntity student;
	@ManyToOne
	private UserEntity issuedBy;
	@Column(name = "issue_date")
	private Date issuedDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BookEntity getBook() {
		return book;
	}
	public void setBook(BookEntity book) {
		this.book = book;
	}
	public StudentEntity getStudent() {
		return student;
	}
	public void setStudent(StudentEntity student) {
		this.student = student;
	}
	public UserEntity getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(UserEntity issuedBy) {
		this.issuedBy = issuedBy;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	
	
	
}
