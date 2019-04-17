package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskListPage {
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement createTaskBtn;
	public WebElement getcreateTaskBtn() {
		return createTaskBtn;
	}
	@FindBy(xpath="//button[text()='- Select Customer -']")
	private WebElement selectcust;
	public WebElement getselectcust() {
		return selectcust;
	}
	@FindBy(xpath="//a[text()='- New Customer -']")
	private WebElement newcust;
	public WebElement getnewcust() {
		return newcust;
	}
	@FindBy(id="createTasksPopup_newCustomer")
	private WebElement newCustName;
	public WebElement getnewCustName() {
		return newCustName;
	}
	@FindBy(id="createTasksPopup_newProject")
	private WebElement newProjectName;
	public WebElement getnewProjectName() {
		return newProjectName;
	}
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	private WebElement  taskName;
	public WebElement gettaskName() {
		return taskName;
	}
	@FindBy(xpath="(//span[text()='Create Tasks'])[1]")
	private WebElement createTask;
	public WebElement getcreateTask() {
		return createTask;
	}
	public void createNewTasks(String newCustName,String newProjectName,String taskName) throws Throwable {
		createTaskBtn.click();
		Thread.sleep(4000);
		selectcust.click();
		newcust.click();
		this.newCustName.sendKeys(newCustName);
		this.newProjectName.sendKeys(newProjectName);
		this.taskName.sendKeys(taskName);
		createTask.click();
		
	}

}
