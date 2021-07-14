package com.daoimpl;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dao.StudentDao;
import com.entities.StudentEntity;
import com.util.Database;

public class StudentDaoImpl implements StudentDao {

	@Override
	public Integer addStudent(StudentEntity student) {
		Integer row = null;
		try {

			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			session.save(student);

			transaction.commit();
			System.out.println("Successfully saved student.");

			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		return row;
	}

	@Override
	public Integer updateStudent(StudentEntity student) {
		Integer row = null;

		try {

			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			session.update(student);

			transaction.commit();
			System.out.println("Successfully updated student.");

			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error : " + e.getMessage());
		}
		return row;
	}

	@Override
	public Integer deleteStudent(StudentEntity student) {
		Integer row = null;

		try {
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			session.remove(student);

			transaction.commit();
			System.out.println("Successfully deleted student.");

			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error : " + e.getMessage());
		}
		return row;
	}

	@Override
	public StudentEntity getStudentById(Integer studentId) {
		StudentEntity student = null;
		try {
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			student = session.get(StudentEntity.class, studentId);

			transaction.commit();
			System.out.println("Successfully fetched student by id.");

			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error : " + e.getMessage());
		}
		return student;
	}

	

	@Override
	public List<StudentEntity> getAllStudent() {
		List<StudentEntity> allStudent = new ArrayList<>();
		try {

			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			TypedQuery<StudentEntity> query = session.createQuery("FROM StudentEntity");
			allStudent = query.getResultList();
			transaction.commit();
			System.out.println("Successfully updated.");
			// factory.close();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error : " + e.getMessage());
		}
		return allStudent;
	}

	@Override
	public Integer getIdByRollNo(String rollNo) {
		Integer id = null;

		StudentEntity student = null;
		try {
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			Query query = session.createQuery("from StudentEntity S where S.rollNo=:n");
			query.setParameter("n", rollNo);


			student = (StudentEntity) query.getSingleResult();
			transaction.commit();
			System.out.println("Successfully fetched student id by roll no.");
			// factory.close();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error : " + e.getMessage());
		}
		return student.getId();
	}

}
