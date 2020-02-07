package manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Manytomanytesting {
	static EntityTransaction transaction = null;
	EntityManager entityManager = null;
	EntityManagerFactory entitymanagerFactory = null;
	public static void main(String[] args) {
		Course c1 =new Course();
		Course c2 =new Course();
		
		
		Students s1 = new Students();
		Students s2 = new Students();
		
		c1.setId(1);
		c1.setName("vigneshkumar");
		c2.setId(2);
		c2.setName("kumar");
		
		
		s1.setId(1);
		s1.setName("java");
		s2.setId(2);
		s2.setName("sql");
		
		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			entityManager.persist(s1);
			entityManager.persist(s2);
			entityManager.persist(c1);
			entityManager.persist(c2);
			
			

			System.out.println("saved");
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		

	}

}
