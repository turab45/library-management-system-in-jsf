package com.dao;

import java.util.List;

import com.entities.AuthorEntity;

public interface AuthorDao {
	public Integer addAuthor(AuthorEntity authorEntity);
	public Integer updateAuthor(AuthorEntity authorEntity);
	public Integer deleteAuthor(AuthorEntity authorEntity);
	public AuthorEntity getAuthorByIdI(Integer id);
	public List<AuthorEntity> getAllAuthor();
}
