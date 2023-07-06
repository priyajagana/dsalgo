package stepDefinitions;

import org.junit.Assert;

import com.pageObjects.PortalPage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.Loggerload;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PortalPage_SD {
	//private static String title;
	public PortalPage_PO pg=new PortalPage_PO(DriverFactory.getDriver());
	//c
	@Given("User opens portal page")
	public void user_opens_portal_page() {
Loggerload.info("user opens portal page");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
		}
	
	@When("User clicks get started button")
	public void user_clicks_get_started_button() {
		Loggerload.info("User clicks get started buttone");
 pg.clickstartbutton(); 
	}

	@Then("User should go to home page")
	public void user_should_go_to_home_page() {
		Loggerload.info("User should go to home page");
    
	}
	@Then("page title should be {string}")
	public void page_title_should_be(String expectedtitlename) {
		Loggerload.info("page title should be {string}");
String title=pg.Getpagetitle();
		System.out.println("pagetitleis; " +title);
		Assert.assertTrue(title.contains(expectedtitlename));
	}
		
	



}
