package stepDefinitions;

import org.junit.Assert;

import com.pageObjects.HomePage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.Loggerload;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_SD {
	private HomePage_PO hp=new HomePage_PO(DriverFactory.getDriver());
	//N
	
	@Given("The user opens Home Page")
	public void the_user_opens_home_page() throws InterruptedException {
		Loggerload.info("user opens home page");
		
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	}

	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String modulename) throws InterruptedException {
		Loggerload.info("The user clicks on Get Started link on homepage {string} without login");
 		
 hp.clickgetstarted(modulename); 
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) throws InterruptedException {
		Loggerload.info("The user get warning message {string} page");
String error= hp.errormsg1();
		 Assert.assertEquals(string,error);
	}
	
	@When("The user clicks Sign in")
	public void the_user_clicks_sign_in() {
		Loggerload.info("The user clicks Sign in");
hp.signin();
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		Loggerload.info("The user should be redirected to Sign in page");
String titleofhomepage="Login";
		  hp.Getpagetitle();	
		  Assert.assertEquals(titleofhomepage,hp.Getpagetitle());
	}
	@When("The user clicks Register")
	public void the_user_clicks_register() {
		Loggerload.info("The user clicks Register");
hp.registerclick();
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		Loggerload.info("The user should be redirected to Register form");

		String titleofhomepage="Registration";
		  hp.Getpagetitle();	
		  Assert.assertEquals(titleofhomepage,hp.Getpagetitle());
	}

}
