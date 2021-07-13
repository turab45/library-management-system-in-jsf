package com.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class BookEntity extends AbstractEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private Integer id;
	@Column(name = "book_code")
	private String bookCode;
	@Column(name = "book_title")
	private String title;
	
	@ManyToOne
	private AuthorEntity author;
	@Column(name = "no_of_copies")
	private Integer noOfCopies;
	@ManyToOne
	private CategoryEntity category;
	@OneToMany
	@JoinColumn(name = "book")
	private List<IssueEntity> allIssuedBooks;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public AuthorEntity getAuthor() {
		return author;
	}
	public void setAuthor(AuthorEntity author) {
		this.author = author;
	}
	public Integer getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(Integer noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public CategoryEntity getCategory() {
		return category;
	}
	public void setCategory(CategoryEntity category) {
		this.category = category;
	}
	public List<IssueEntity> getAllIssuedBooks() {
		return allIssuedBooks;
	}
	public void setAllIssuedBooks(List<IssueEntity> allIssuedBooks) {
		this.allIssuedBooks = allIssuedBooks;
	}
	
	
	
}
