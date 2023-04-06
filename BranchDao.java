package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dto.Branch;

@Component
public class BranchDao {
@Autowired
EntityManagerFactory entityManagerFactory;
//save
public Branch saveBranch(Branch branch )
{
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	if(branch != null)
	{
		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();
	}
	return branch;
}
//update
public Branch updateBranch(Branch branch )
{

	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch2=entityManager.find(Branch.class, branch.getId());//if we not taken but outputcame
	if(branch2 != null)
	{
		entityTransaction.begin();
		entityManager.merge(branch);
		entityTransaction.commit();
	}
	return branch;
	
}
//getbyid
public Branch getByIdBranch(int id)
{
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	return entityManager.find(Branch.class,id);
}
//delete
public Branch deleteBranch(int id)
{
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
   Branch branch =entityManager.find(Branch.class, id);
   if(branch != null)
	{
		entityTransaction.begin();
		entityManager.remove(branch);
		entityTransaction.commit();
	}
	return branch; 
	

}
//getall
public List<Branch>getAllBranch()
{
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Query quary=entityManager.createQuery("select a from Branch a");
	List<Branch>list=quary.getResultList();
	return list;
	
}

}
