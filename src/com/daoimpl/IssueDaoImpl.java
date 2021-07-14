package com.daoimpl;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dao.IssueDao;
import com.entities.IssueEntity;
import com.util.Database;

public class IssueDaoImpl implements IssueDao{
	

	@Override
	public Integer addIssue(IssueEntity issue) {
		Integer row = null;
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();
			
			row = (Integer) session.save(issue);

			
			
			transaction.commit();
			System.out.println("Successfully saved issued.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		return row;
	}

	@Override
	public Integer updateIssue(IssueEntity issue) {
		Integer row = null;
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			session.update(issue);
			row = 1;
			
			
			transaction.commit();
			System.out.println("Successfully updated issue.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		return row;
	}

	@Override
	public Integer deleteIssue(IssueEntity issue) {
		Integer row = null;
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			session.remove(issue);
			row = 1;
			
			
			transaction.commit();
			System.out.println("Successfully removed issue.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		return row;
	}

	@Override
	public IssueEntity getIssueById(Integer id) {
		IssueEntity issue = null;
		
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			issue = session.get(IssueEntity.class, id);

			
			
			transaction.commit();
			System.out.println("Successfully fetched issue by id.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		
        return issue;
	}

	@Override
	public List<IssueEntity> getAllIssue() {
		List<IssueEntity> allIssue = new ArrayList<IssueEntity>();
try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			allIssue = session.createQuery("from IssueEntity i  where i.status>0").list();

			
			
			transaction.commit();
			System.out.println("Successfully fetched all isuue.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
            
        
        return allIssue;
	}



	@Override
	public Integer returnBook(IssueEntity issueEntity) {
		Integer row = null;
		try {
			
			SessionFactory factory = Database.getConnection();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();
			
			issueEntity.setStatus(0);
			
			session.update(issueEntity);

			
			
			transaction.commit();
			System.out.println("Successfully updated.");
			
			session.close();

		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
		return row;
	}
	


}
