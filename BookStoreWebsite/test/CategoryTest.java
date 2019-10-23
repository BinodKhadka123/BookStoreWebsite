import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bookstore.entity.Book;
import com.bookstore.entity.BookOrder;
import com.bookstore.entity.Category;
import com.bookstore.entity.Customer;
import com.bookstore.entity.OrderDetail;
import com.bookstore.entity.Review;
import com.bookstore.entity.Users;

public class CategoryTest {
	public static void main(String[] args) {

		// create session factory
		/*SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Category.class)
								.addAnnotatedClass(Book.class)
								.addAnnotatedClass(OrderDetail.class)
								.addAnnotatedClass(BookOrder.class)
								.addAnnotatedClass(Customer.class)
								.addAnnotatedClass(Review.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();*/
		
		/*try {
			
			//create users object
			
			System.out.println("Creating new category object...");
			Category tempStudent= new Category("Core Java");
			
			
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
		
		
		

		Category tempCategory= new Category("Core Java");
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(tempCategory);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("Category object was persisted");
		
		
		
	}



	}



