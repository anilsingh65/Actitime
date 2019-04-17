package com.datadriven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class DataDrivenTest {
	@BeforeMethod
	public void configBM() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com");
	}
	

}
