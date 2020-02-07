package com.testyantra.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpatest.dto.Movie;

public class Readdemo {
	static EntityTransaction transaction = null;
	EntityManager entityManager=null;
	EntityManagerFactory entitymanagerFactory=null;
	public static void main(String[] args) {
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			Movie movie= entityManager.getReference(Movie.class,101);
			//System.out.println(movie.getClass());// this gives the proxy object
//		Movie movie= entityManager.find(Movie.class,101);
//			System.out.println(movie.getId());
//			System.out.println(movie.getName());
//			System.out.println(movie.getRating());
			entityManager.detach(movie);  //it removes the object
			System.out.println(entityManager.contains(movie));
		   transaction.commit();
		
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}


	}

}
