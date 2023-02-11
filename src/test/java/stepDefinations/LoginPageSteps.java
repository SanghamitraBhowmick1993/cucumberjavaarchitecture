package stepDefinations;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.LoginPage;
import com.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	static private String title;
	DriverFactory prop;
	ConfigReader configR = new ConfigReader();
	//Given --> pre condition , when is action , then is assertion
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getLoginPageTitle();
		System.out.println("My title is " + title);

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		Assert.assertTrue(title.contains(expectedTitle));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
	    Assert.assertTrue(loginPage.isForgotpwdLinkExts());
	}

	@When("user enters username {string}")
	public void user_enters_username(String userName) {
		loginPage.enterUserName(userName);
	}

	@When("user enters password {string}")
	public void user_enters_password(String pwd) {
		loginPage.enterPassword(pwd);
	}
	
	@When("user enters username")
	public void user_enters_username1() {
		System.out.println(System.getProperty("username"));
		loginPage.enterUserName(System.getProperty("username"));
	}

	@When("user enters password")
	public void user_enters_password1() {

		loginPage.enterPassword(System.getProperty("password"));
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLogin();
	}

	
}
