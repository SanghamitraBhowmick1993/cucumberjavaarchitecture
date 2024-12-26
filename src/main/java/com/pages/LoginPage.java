package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.util.ConfigReader;

public class LoginPage {
	private WebDriver driver;
	static ConfigReader reader = new ConfigReader();
	
	// 1. By locators or OR
	private By usernm = By.id("user-name");
	private By password = By.id("password");
	private By signInButton = By.id("login-button");
	private By forgotPwdLink = By.linkText("Forgot your password?111");

	
	//2. Constructor of page class
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	//3. Page Actions
	public void login_testapp() {
		System.out.println("test url is...." + reader.getEnvironmentProperty());
		try {
			String url = reader.getEnvironmentProperty();
			driver.get(url);
			driver.navigate().refresh();
		} catch (Exception e) {
			System.out.println("err loading url " + e.getMessage());
			e.printStackTrace();
		}
		//reader.getURL();
		
	}
	public String getLoginPageTitle(){
		return driver.getTitle();
	}
		
	
	public void enterUserName(String userName) throws InterruptedException{
		driver.findElement(usernm).sendKeys(reader.getUsername());
		Thread.sleep(2000);

	}
	public void enterPassword(String pwd){
		driver.findElement(password).sendKeys(reader.getPassword());
	}
	public void clickOnLogin() throws InterruptedException{
		driver.findElement(signInButton).click();
		Thread.sleep(2000);
	}
	
	public String getURL(){
		return driver.getCurrentUrl();
	}
	
}
