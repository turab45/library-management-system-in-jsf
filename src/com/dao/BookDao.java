package com.dao;


import java.util.List;

import com.entities.BookEntity;

public interface BookDao {
	public Integer addBook(BookEntity bookEntity);
	public Integer updateBook(BookEntity bookEntity);
	public Integer deleteBook(BookEntity bookEntity);
	public BookEntity getBookById(Integer id);
	public List<BookEntity> getAllBook();
}
