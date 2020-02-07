package com.testyantra.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpatest.dto.Movie;

public class App {

	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager entityManager=null;
		EntityManagerFactory entitymanagerFactory=null;
		
		    Movie movie = new Movie();
			movie.setId(104);
			movie.setName("dam");
			movie.setRating("Excellent");
		
			
			try {
			entitymanagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entitymanagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			System.out.println("printed");
			transaction.commit();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}

}
