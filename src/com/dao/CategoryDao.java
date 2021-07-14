package com.dao;

import java.util.List;

import com.entities.CategoryEntity;

public interface CategoryDao {
	public Integer addCategory(CategoryEntity categoryEntity);
	public Integer updateCategory(CategoryEntity categoryEntity);
	public Integer deleteCategory(CategoryEntity categoryEntity);
	public CategoryEntity getCategoryById(Integer id);
	public List<CategoryEntity> getAllCategory();
}
