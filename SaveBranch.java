package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Branch;
import com.jsp.service.BranchSarvice;
import com.jsp.util.MyConfig;

public class SaveBranch {
	public static void main(String[] args) {
		
	
ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
Branch branch=(Branch)applicationContext.getBean("branch");
branch.setId(2);
branch.setBname("qspider");
branch.setAddr("Jangaon");
branch.setPhone(991266);
BranchSarvice branchSarvice=(BranchSarvice)applicationContext.getBean("branchSarvice");
Branch branch2= branchSarvice.saveBranchService(branch);
if(branch2 != null)
{
	System.out.println("DATA SAVED");
}
else
{
	System.out.println("DATA NOT SAVED");
}

}
}