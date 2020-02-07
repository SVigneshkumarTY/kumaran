package com.testyantra.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpatest.dto.Movie;



public class AppTest { // retrieve

	public static void main(String[] args) {
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			Movie movie= entityManager.find(Movie.class,101);
			System.out.println(movie.getId());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
