package com.dao;

import java.util.List;

import com.entities.UserEntity;

public interface UserDao {
	public Integer addUser(UserEntity userEntity);
	public Integer updateUser(UserEntity userEntity);
	public Integer deleteUser(UserEntity userEntity);
	public UserEntity getUserById(Integer id);
	public UserEntity getUserByEmailAndPassword(String email, String password);
	public List<UserEntity> getAllUser();
}
