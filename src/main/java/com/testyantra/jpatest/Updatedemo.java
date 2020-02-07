package com.testyantra.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpatest.dto.Movie;

public class Updatedemo {
	public static void main(String[]args) {
	EntityTransaction transaction = null;
	EntityManager entityManager=null;
	EntityManagerFactory entitymanagerFactory=null;
	
	try{
		entitymanagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	
	entityManager=entitymanagerFactory.createEntityManager();
	transaction= entityManager.getTransaction();
	transaction.begin();
	Movie movie= entityManager.find(Movie.class,101);
	movie.setName("hello hai how");
	System.out.println("record delted");
	transaction.commit();
}
catch(Exception e) {
	transaction.rollback();
	e.printStackTrace();
	
}
	}
}
