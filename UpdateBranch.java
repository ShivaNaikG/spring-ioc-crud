package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Branch;
import com.jsp.service.BranchSarvice;
import com.jsp.util.MyConfig;

public class UpdateBranch {
public static void main(String[] args) {
	


ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
Branch branch=(Branch)applicationContext.getBean("branch");

branch.setId(1);
branch.setBname("shyspider");
branch.setAddr("jnh");
branch.setPhone(991277);



BranchSarvice branchSarvice=(BranchSarvice)applicationContext.getBean("branchSarvice");
Branch branch2= branchSarvice.updateBranchService(branch);
if(branch2 != null)
{
	System.out.println("DATA updated");
}
else
{
	System.out.println("DATA NOT updated");
}

}
}

