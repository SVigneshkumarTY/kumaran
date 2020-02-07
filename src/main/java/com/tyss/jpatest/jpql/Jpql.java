package com.tyss.jpatest.jpql;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.jpatest.dto.Movie;



public class Jpql {

	 EntityTransaction transaction = null;
	EntityManager entityManager= null;
	EntityManagerFactory entitymanagerFactory= null;
		public static void main(String[] args) {
		 
				EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
				EntityManager entityManager=entityManagerFactory.createEntityManager();
				//String jpql = "from Movie";
				
				String jpql = "select name from Movie";
				
				Query query = entityManager.createQuery(jpql);
		//	List<Movie>resultList = query.getResultList();
List<String>resultList =query.getResultList();
            
//         for(Movie a : resultList) {
//				System.out.println(a.getId());
//				System.out.println(a.getName());
//			}
			
for(String string : resultList) {
	System.out.println(string);
}
			
			
			}
}
	


