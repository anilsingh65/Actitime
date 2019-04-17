package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(name="username")
	private WebElement usernameEdt;
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	public WebElement getusernameEdt() {
		return usernameEdt;
	}
	public  WebElement getpasswordEdt() {
		return passwordEdt;
	}
	public WebElement getloginBtn() {
		return loginBtn;
	}
	public void loginToApp(String username,String password) {
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}

}
