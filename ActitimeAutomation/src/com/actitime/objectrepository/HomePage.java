package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//a[@class='logout' or @id='logoutLink']")
	private WebElement logoutLink;
	public void logout() {
		logoutLink.click();
	}
	@FindBy(xpath="//div[text()='TIME-TRACK']/..")
	private WebElement timetrack;
	public void clicktimetrack() {
		timetrack.click();
	}
	@FindBy(xpath="//div[text()='TASKS']/..")
	private WebElement tasks;
	public void clicktasks() throws Throwable {
		Thread.sleep(4000);
		tasks.click();
	}
	@FindBy(xpath="//div[text()='REPORTS']/..")
	private WebElement reports;
	public void clickreports() {
		reports.click();
	}
	@FindBy(xpath="//div[text()='USERS']/..")
	private WebElement users;
	public void clickusers() {
		users.click();
	}

}
