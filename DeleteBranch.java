package com.jsp.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Branch;
import com.jsp.service.BranchSarvice;
import com.jsp.util.MyConfig;

public class DeleteBranch {
	public static void main(String[] args) {
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
	Branch branch=(Branch)applicationContext.getBean("branch");
	/*
	 * Scanner sc=new Scanner(System.in);
	 * System.out.println("ENTER EMPLOYEE ID WE WANT TO DELETE DATA"); int
	 * id=sc.nextInt();
	 */
	BranchSarvice branchSarvice=(BranchSarvice)applicationContext.getBean("branchSarvice");
	Branch branch2= branchSarvice.deleteBrancServiceh(2);
	if(branch2 != null)
	{
		System.out.println("DATA deleted");
	}
	else
	{
		System.out.println("DATA NOT deleted");
	}
}
}
