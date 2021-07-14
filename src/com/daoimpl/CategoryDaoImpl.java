package com.daoimpl;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.dao.CategoryDao;
import com.entities.CategoryEntity;
import com.util.Database;

public class CategoryDaoImpl implements CategoryDao{
	

	@Override
	public Integer addCategory(CategoryEntity category) {
		Integer row = null;
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			session.save(category);

			
			
			transaction.commit();
			System.out.println("Successfully saved category.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		return row;
	}

	@Override
	public Integer updateCategory(CategoryEntity category) {
		Integer row = null;
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			session.update(category);

			
			
			transaction.commit();
			System.out.println("Successfully updated category.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		return row;
	}

	@Override
	public Integer deleteCategory(CategoryEntity category) {
		Integer row = null;
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			session.remove(category);

			
			
			transaction.commit();
			System.out.println("Successfully deleted category.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		return row;
	}

	

	@Override
	public CategoryEntity getCategoryById(Integer id) {
		CategoryEntity category = null;
		
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			category = session.get(CategoryEntity.class, id);

			
			
			transaction.commit();
			System.out.println("Successfully fetched category by id.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		
        return category;
	}

	@Override
	public List<CategoryEntity> getAllCategory() {
		List<CategoryEntity> allCategory = new ArrayList<CategoryEntity>();
		
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			allCategory = session.createQuery("from CategoryEntity").getResultList();

			
			
			transaction.commit();
			System.out.println("Successfully fetched all categories.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		
        return allCategory;
	}

}
