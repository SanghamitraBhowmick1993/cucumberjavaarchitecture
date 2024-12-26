package parallel;

import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageSteps {
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		loginPage.login_testapp();	
	}
	
	@And("user enters username as {string}")
	public void user_enters_username(String unm) throws InterruptedException {
		loginPage.enterUserName(unm);
	}
	
	@And("user enters password as {string}")
	public void user_enters_password(String pass) {
		loginPage.enterPassword(pass);
	}
	
	@Then("user clicks on Login")
	public void user_clicks_logins() throws InterruptedException {
		loginPage.clickOnLogin();
	}
	
	@Then("validate the url contains {string}")
	public void validateURL(String url) {
        Assert.assertTrue(url.contains(loginPage.getURL()));

	}
	
}
