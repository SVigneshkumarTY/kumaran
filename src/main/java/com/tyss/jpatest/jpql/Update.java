package com.tyss.jpatest.jpql;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.jpatest.dto.Movie;

public class Update {

	
		 static EntityTransaction transaction = null;
			EntityManager entityManager= null;
			EntityManagerFactory entitymanagerFactory= null;
				public static void main(String[] args) {
				try{
				 
						EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
						EntityManager entityManager=entityManagerFactory.createEntityManager();
						transaction= entityManager.getTransaction();
						transaction.begin();
						
						String jpql = " Update Movie set name = 'tube'  where id= 102 ";
						
						Query query = entityManager.createQuery(jpql);
					int a =	query.executeUpdate();
				System.out.println(a);
				transaction.commit();
		
					
					

	}catch(Exception e)
				{
		transaction.rollback();
		e.printStackTrace();
				}
}
}
