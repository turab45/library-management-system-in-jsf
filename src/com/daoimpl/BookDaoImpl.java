package com.daoimpl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.dao.BookDao;
import com.entities.BookEntity;
import com.util.Database;

public class BookDaoImpl implements BookDao{
	
		

	@Override
	public Integer addBook(BookEntity book) {
		Integer row = null;
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			row = (Integer) session.save(book);

			
			
			transaction.commit();
			System.out.println("Successfully saved book.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		return row;
	}

	@Override
	public Integer updateBook(BookEntity book) {
		Integer row = null;
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			session.update(book);
			row = 1;
			
			
			transaction.commit();
			System.out.println("Successfully updated book.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		return row;
	}

	@Override
	public Integer deleteBook(BookEntity book) {
		Integer row = null;
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			session.remove(book);
			row = 1;
			
			
			transaction.commit();
			System.out.println("Successfully deleted book.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		return row;
	}

	

	@Override
	public BookEntity getBookById(Integer id) {
		BookEntity book = null;
		
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			book = session.get(BookEntity.class, id);

			
			
			transaction.commit();
			System.out.println("Successfully fethched book by id.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		
        return book;
	}

	@Override
	public List<BookEntity> getAllBook() {
		List<BookEntity> allBook = new ArrayList<BookEntity>();
		
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			allBook = session.createQuery("from BookEntity").getResultList();

			
			
			transaction.commit();
			System.out.println("Successfully fetched all books.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		
        return allBook;
	}
	

}
