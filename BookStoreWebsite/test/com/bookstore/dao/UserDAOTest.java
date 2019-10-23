package com.bookstore.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bookstore.entity.Users;

public class UserDAOTest {

	@Test
	public void testCreateUsers() {

		// create session factory
				/*factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Users.class)
										.buildSessionFactory();
				
				// create session
			 session = factory.getCurrentSession();
			
						
				try {
					
					//create users object
					
					System.out.println("Creating new users object...");
					Users tempUsers = new Users("rokka.nikesh@gmail.com", "Nikesh", "Rokka");
					
					userDAO=new UserDAO();
					tempUsers= userDAO.create(tempUsers);
					assertTrue(tempUsers.getUserId()>0);
				}
				finally {
					factory.close();
				}
	}*/
	
	
	

	
	/*Users tempUsers = new Users("khadka.sabbu@gmail.com", "Sabbu", "Khadka");
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	UserDAO userDAO=new UserDAO (entityManager);
	tempUsers= userDAO.create(tempUsers);
	entityManager.close();
	entityManagerFactory.close();
	System.out.println("User object was persisted");
	assertTrue(tempUsers.getUserId()>0);*/
		

		/*Users tempUsers = new Users(1,"rokka.niraj@gmail.com", "Niraj", "pooza");
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		UserDAO userDAO=new UserDAO (entityManager);
		tempUsers= userDAO.update(tempUsers);
		String expected="pooza";
		String actual=tempUsers.getPassword();
		assertEquals(expected,actual);
		entityManager.close();
		entityManagerFactory.close();*/
		
		
		
		/*Users tempUsers = new Users();
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		UserDAO userDAO=new UserDAO (entityManager);
		Integer userId=1;
		tempUsers= userDAO.get(userId);
		System.out.println(tempUsers.getEmail());*/
		
		/*Users tempUsers = new Users();
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		UserDAO userDAO=new UserDAO (entityManager);
		Integer userId=8;
		userDAO.delete(userId);
		System.out.println(tempUsers.getUserId());
		assertNull(tempUsers);*/
		

		/*Users tempUsers = new Users();
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		UserDAO userDAO=new UserDAO (entityManager);
		List<Users> users=userDAO.listAll();
		for(Users maya:users)
		{
			System.out.println(maya.getEmail());
		}
		assertTrue(users.size()>0);*/
		
		
		Users tempUsers = new Users();
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		UserDAO userDAO=new UserDAO (entityManager);
		long totalUsers=userDAO.count();
		assertEquals(6,totalUsers);
		
		
		
		}
}
	
	


