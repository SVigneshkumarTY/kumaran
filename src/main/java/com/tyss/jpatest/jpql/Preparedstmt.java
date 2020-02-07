package com.tyss.jpatest.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Preparedstmt {

	static EntityTransaction transaction = null;
	EntityManager entityManager= null;
	EntityManagerFactory entitymanagerFactory= null;
	public static void main(String[] args) {
		try{

			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();

			//String jpql = " update  Movie  set name =:nm  where id=:id ";
			String jpql = " delete from  Movie where name =:nm  and  id=:id "; 
			
			//String jpql = " insert into Movie   name =:nm  where id=:id ";
			
			Query query = entityManager.createQuery(jpql);
			
			query.setParameter("nm","abcd");
			query.setParameter("id", 154);
			
			
			
			int a =	query.executeUpdate();
			System.out.println(a);
			transaction.commit();




		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}
}
