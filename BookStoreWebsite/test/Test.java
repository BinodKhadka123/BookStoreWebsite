import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.bookstore.entity.Users;

public class Test {
	public static void main(String[] args) {

		// create session factory
		/*SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Users.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();*/
		
		
		
		Users tempUsers = new Users("khadka.binod@gmail.com", "Binod", "Khadka");
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(tempUsers);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("User object was persisted");
			
			//create users object
			
			/*System.out.println("Creating new users object...");
			Users tempStudent = new Users("puri.pujan@gmail.com", "Pujan", "puri");
			
			// start a transaction
			session.beginTransaction();
			
			// save the user object
			System.out.println("Saving the users...");
			session.save(tempStudent);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}*/
		
		
		
	}



	}



