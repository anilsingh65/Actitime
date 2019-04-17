package com.actime.testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.FileLib;
import com.actitime.objectrepository.HomePage;
import com.actitime.objectrepository.TaskListPage;
@Listeners(com.actitime.genericlib.ListenerImp.class)
public class CreateCustomerTest  extends BaseClass{
	@Test
	public void newCustomer() throws Throwable {
		System.out.println("Execute test script");
		HomePage hp=PageFactory.initElements(BaseClass.driver, HomePage.class);
		hp.clicktasks();
		FileLib flib=new FileLib();
	String CUSTNAME=	flib.getExcelData("Sheet1", 1, 0);
	String PRONAME=	flib.getExcelData("Sheet1", 1, 1);
	String TASKNAME=	flib.getExcelData("Sheet1", 1, 2);
	TaskListPage tl=PageFactory.initElements(BaseClass.driver, TaskListPage.class);
	tl.createNewTasks(CUSTNAME, PRONAME, TASKNAME);
	}

}
