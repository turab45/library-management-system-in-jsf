package com.daoimpl;


import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dao.UserDao;
import com.entities.UserEntity;
import com.util.Database;



public class UserDaoImpl implements UserDao{
	

	@Override
	public Integer addUser(UserEntity user) {
		Integer row = null;
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			session.save(user);

			
			
			transaction.commit();
			System.out.println("Successfully saved.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		return row;
	}

	@Override
	public Integer updateUser(UserEntity user) {
		Integer row = null;
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			session.update(user);

			
			
			transaction.commit();
			System.out.println("Successfully updated.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		return row;
	}

	@Override
	public Integer deleteUser(UserEntity user) {
		Integer row = null;
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			session.remove(user);

			
			
			transaction.commit();
			System.out.println("Successfully saved.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		return row;
	}

	@Override
	public UserEntity getUserById(Integer id) {
		UserEntity user = null;
		try {
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();
			
			user = session.get(UserEntity.class, id);

			transaction.commit();
			System.out.println("Successfully updated.");
			//factory.close();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error : " + e.getMessage());
		}
		return user;
	}

	

	@Override
	public List<UserEntity> getAllUser() {
		List<UserEntity>  allUser = new ArrayList<UserEntity>();
		
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			allUser = session.createQuery("from UserEntity").list();

			
			
			transaction.commit();
			System.out.println("Successfully fetched.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		
        return allUser;
	}

	@Override
	public UserEntity getUserByEmailAndPassword(String email, String password) {
		UserEntity  user = null;
		
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			user = (UserEntity) session.createQuery("from UserEntity u where u.email=:e and u.password=:p").getSingleResult();

			
			
			transaction.commit();
			System.out.println("Successfully fetched.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		
        return user;
	}



}
