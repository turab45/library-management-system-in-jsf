package com.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class AuthorEntity extends AbstractEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "author_id")
	private Integer id;
	@Column(name = "author_name")
	private String name;
	@Column(name = "no_of_publications")
	private Integer noOfPublications;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "author")
	private List<BookEntity> allBooks;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoOfPublications() {
		return noOfPublications;
	}

	public void setNoOfPublications(Integer noOfPublications) {
		this.noOfPublications = noOfPublications;
	}

	public List<BookEntity> getAllBooks() {
		return allBooks;
	}

	public void setAllBooks(List<BookEntity> allBooks) {
		this.allBooks = allBooks;
	}
	
	
}
