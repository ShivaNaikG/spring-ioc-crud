package com.jsp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Branch;
import com.jsp.service.BranchSarvice;
import com.jsp.util.MyConfig;

public class GetById {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Branch branch=(Branch)applicationContext.getBean("branch");

		BranchSarvice branchSarvice=(BranchSarvice)applicationContext.getBean("branchSarvice");
		Branch branch2=  branchSarvice.getByIdBranchService(1);

		if(branch2 !=null) {
			System.out.println("BRANCH ID: "+branch2.getId());
			System.out.println("BRANCH NAME: "+branch2.getBname());
			System.out.println("BRANCH ADDRASS: "+branch2.getAddr());
			System.out.println("BRANCH PHONE NO: "+branch2.getPhone());
		}
		else {
			System.out.println("CHECK THE DATA"); }

		System.out.println(branch2);
	}
}
