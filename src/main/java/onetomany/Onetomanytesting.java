package onetomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Onetomanytesting {
	static EntityTransaction transaction = null;
	EntityManager entityManager = null;
	EntityManagerFactory entitymanagerFactory = null;

	public static void main(String[] args) {

	  

		
			
				Pencil p1 = new Pencil();
				Pencil p2 = new Pencil();
				Pencilbox pb = new Pencilbox();

				
	            
				p2.setId(2);
				
				p2.setName("camlin");


				pb.setId(2);
				
				pb.setName("box2");

				
				ArrayList<Pencil>a1= new ArrayList<Pencil>();
				a1.add(p1);
				a1.add(p2);
				
				
				try {
				
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
				EntityManager entityManager = entityManagerFactory.createEntityManager();
				transaction = entityManager.getTransaction();
				transaction.begin();
				
				
				
				
			   entityManager.persist(pb);
			   entityManager.persist(p1);
			   entityManager.persist(p2);
			   
		    
				System.out.println("saved");
				transaction.commit();

			} catch (Exception e) {
				e.printStackTrace();
			}


	}

}
