package AppHooks;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.factory.DriverFactory;
import com.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class AppHooks {

	private DriverFactory driverfactory;
	public WebDriver driver;
	private ConfigReader configreader;
	Properties prop;
	int countScreenshot=1;
	

	@Before
	public void getProperty() {
		System.out.println("inside before getProperty");

		configreader = new ConfigReader();
		prop = configreader.init_prop();
	}

	@BeforeStep
	public void setUpSparktest() {
		System.out.println("inside before setUpSparktest");

		ExtentTest test = ExtentManager.getInstance().createTest("TestCase" + countScreenshot);
		ExtentReport.setTest(test);
	}



	@Before
	public void launchBrowser() {
		System.out.println("inside before launchBrowser");

		String browserName = prop.getProperty("browser");
		driverfactory = new DriverFactory();
		driver = driverfactory.init_driver(browserName);
	}

	@After
	public void quit() {
		System.out.println("inside before quit");

		driver.quit();
	}

	@AfterStep
	public void SparktestResult() throws IOException {
		System.out.println("inside after method");
			ExtentReport.getTest().log(Status.FAIL, "test case failed as - ");
			String screenshotPath = Util.getScreenshot("testScreenshot" + countScreenshot + ".png");
			System.out.println("path " + screenshotPath  + "count " + countScreenshot);
			countScreenshot++;
			/*
			 * ExtentReport.getTest() .addScreenCaptureFromPath(screenshotPath)
			 * .fail(MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build())
			 * ;
			 */
			ExtentReport.getTest().fail(MediaEntityBuilder
					.createScreenCaptureFromBase64String(Util.convertImg_Base64(screenshotPath)).build());

		}

	@After
	public void sparkFlush() {
		System.out.println("flush");
		ExtentManager.getInstance().flush();
	}
}
