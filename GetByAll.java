package com.jsp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Branch;
import com.jsp.service.BranchSarvice;
import com.jsp.util.MyConfig;

public class GetByAll {
public static void main(String[] args) {
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
	Branch branch=(Branch)applicationContext.getBean("branch");
	
	BranchSarvice branchSarvice=(BranchSarvice)applicationContext.getBean("branchSarvice");
List<Branch> branch2= branchSarvice.getAllBranchService();
	if(branch2.size()>0)
	{
		for(Branch branch3:branch2 ) {
		System.out.println("BRANCH ID: "+branch3.getId());
		System.out.println("BRANCH NAME: "+branch3.getBname());
		System.out.println("BRANCH ADDRASS: "+branch3.getAddr());
		System.out.println("BRANCH PHONE NO: "+branch3.getPhone());
		System.out.println();  
	}
	}
	else
	{
		System.out.println("CHECK THE DATA");
	}
}
}
