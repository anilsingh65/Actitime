package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectrepository.HomePage;
import com.actitime.objectrepository.LoginPage;

public class BaseClass {
	FileLib flib=new FileLib();
	public static WebDriver driver;
	@BeforeClass
	public void configBC() throws Throwable {
		String BROWSER=flib.getPropertyKeyValue("browser");
		if(BROWSER.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
			driver=new ChromeDriver();
		}
	}
	@BeforeMethod
	public void configBM() throws Throwable {
		String URL=flib.getPropertyKeyValue("url");
		String USERNAME=flib.getPropertyKeyValue("username");
		String PASSWORD=flib.getPropertyKeyValue("password");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
		LoginPage lg=PageFactory.initElements(driver, LoginPage.class);
		lg.loginToApp(USERNAME, PASSWORD);
	}
	@AfterMethod
	public void configAM() throws Throwable {
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(4000);
		hp.logout();
	}
	@AfterClass
	public void configAC()  {
		driver.close();
	}

}
