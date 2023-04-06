package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.BranchDao;
import com.jsp.dto.Branch;
@Component
public class BranchSarvice {
	@Autowired
	BranchDao dao;
	
	//save
	public Branch saveBranchService(Branch branch )
	{
		return dao.saveBranch(branch);
	}
	//update
	public Branch updateBranchService(Branch id )
	{
		return dao.updateBranch(id);
	}
	//getByid
	public Branch getByIdBranchService(int id)
	{
		return dao.getByIdBranch(id);
	}
	//delete
	public Branch deleteBrancServiceh(int id)
	{
		return dao.deleteBranch(id);
	}
	//getall
	public List<Branch>getAllBranchService()
	{
	return dao.getAllBranch();
	}
}
