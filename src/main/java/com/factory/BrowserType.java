//package com.factory;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public enum BrowserType {
//	chrome{
//		@Override
//		public WebDriver init() {
//			//ChromeOptions options = new ChromeOptions();
//			//options.addArguments("--remote-allow-origins=*");
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
////			WebDriverManager.chromedriver().setup();
////			System.out.println("Browser Version::::::::::: " + WebDriverManager.chromedriver().getBrowserPath());
////			System.out.println("Driver Version:::::::::: " + WebDriverManager.chromedriver().getDownloadedDriverPath());
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--disable-web-security");      // Disable web security (if safe)
//			options.addArguments("--allow-running-insecure-content");
//			return new ChromeDriver(options);
//			
//
//
////			String driverFilePathForLocal = System.getProperty("driverFilePathForLocal");
////			if(driverFilePathForLocal != null) {
////				//System.setProperty("webdriver.chrome.driver", driverFilePathForLocal);
////
////			}
////			else {
////				//jenkins setup
////				String driverFilePathForJenkins = System.getProperty("driverFilePathForJenkins");
////				System.setProperty("webdriver.chrome.driver", driverFilePathForJenkins);
////				//running tests in headless mode
////				DesiredCapabilities dc = new DesiredCapabilities();
////				options.addArguments("--headless"); // Run Chrome in headless mode
////				options.addArguments("--disable-gpu"); // Disable GPU (useful for Linux environments)
////				options.addArguments("--window-size=1920,1080"); // Set window size
////				options.addArguments("--disable-extensions"); // Disable extensions
////				options.addArguments("--no-sandbox"); // Bypass OS security model (useful for CI/CD)
////				options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
////				options.addArguments("--remote-allow-origins=*"); // Allow all remote origins (you provided this)
////				options.addArguments("--disable-infobars"); // Disable the "Chrome is being controlled by automated test software" info bar
////				options.addArguments("--disable-notifications"); // Disable notifications
////				options.addArguments("--disable-popup-blocking"); // Disable popup blocking
////				options.addArguments("--disable-browser-side-navigation"); // Disable side navigation (can prevent certain navigation issues)
////				options.addArguments("--mute-audio"); // Mute audio during tests
////				options.addArguments("--allow-insecure-localhost"); // Allow running tests on self-signed HTTPS sites
////
////				options.merge(dc);
////			}
//			//return new ChromeDriver();
//			
//		}
//	},
//	firefox{
//	@Override
//	public WebDriver init() {
//		WebDriverManager.firefoxdriver().setup();
//		return new FirefoxDriver();
//	}
//
//},
//	safari{
//	@Override
//	public WebDriver init() {
//		WebDriverManager.firefoxdriver().setup();
//		return new FirefoxDriver();
//	}
//	
//},
//	edge{
//	@Override
//	public WebDriver init() {
//		WebDriverManager.firefoxdriver().setup();
//		return new FirefoxDriver();
//	}
//};
//	public abstract WebDriver init();
//}
