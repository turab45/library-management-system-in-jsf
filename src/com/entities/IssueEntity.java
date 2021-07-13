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
public class IssueEntity {
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
	
}
