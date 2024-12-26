package com.factory;


import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {


	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	public static WebDriver driver;
	Properties prop;

	/**
	 * This method is used to initialize the threadlocal driver on the basis of given
	 * browser
	 * 
	 * @param browser
	 * @return this will return tldriver.
	 */
	public static WebDriver init_driver(String browser) {
		System.out.println("browser value is: " + browser);
		if(browser.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
			 WebDriverManager.chromedriver().setup();
		}
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-debugging-port=9222"); // Use an open port
		options.addArguments("--disable-web-security");      // Disable web security for testing
		options.addArguments("--allow-running-insecure-content"); 
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--headless");
		options.addArguments("--user-data-dir=\"/cucumberjavaarchitecture\"");
		tlDriver.set(new ChromeDriver(options));
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(180));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return getDriver();


	}

	/**
	 * this is used to get the driver with ThreadLocal
	 * 
	 * @return
	 */
	public static synchronized WebDriver getDriver() {
		if(tlDriver == null) {
			System.out.println("driver is null");
			return tlDriver.get();
		}
		return tlDriver.get();
	}
	
	
}