package Onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Onetoone {

	static EntityTransaction transaction = null;
	EntityManager entityManager = null;
	EntityManagerFactory entitymanagerFactory = null;

	public static void main(String[] args) {
		try {
			Person p1 = new Person();
			Voterid v1 = new Voterid();

			p1.setId(2);
			p1.setAge(22);
			p1.setName("ickey");

			v1.setVid(2);
			v1.setVname("run");
			v1.setVage(23);

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			
			
			Voterid votercard = entityManager.find(Voterid.class,1); /// give the class name
			votercard.getPerson1().getName();
			//entityManager.persist(p1);
			//entityManager.persist(v1);
			System.out.println("saved");
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
