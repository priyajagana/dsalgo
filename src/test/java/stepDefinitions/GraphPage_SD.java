package stepDefinitions;

import org.junit.Assert;

import com.pageObjects.GraphPage_PO;
import com.pageObjects.LoginPage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.Loggerload;

import io.cucumber.java.en.*;

public class GraphPage_SD {
//s
	private GraphPage_PO gp = new GraphPage_PO(DriverFactory.getDriver());
	private LoginPage_PO lp = new LoginPage_PO(DriverFactory.getDriver());
	
	@When("The user clicks {string} sub link of Graph Page")
	public void the_user_clicks_sub_link_of_graph_page(String subLink) {
		Loggerload.info("user opens graphpage");
	    gp.subLinkClick(subLink);
	}
	
	@Then("The user should be directed to {string} of Graph Page")
	public void the_user_should_be_directed_to_of_graph_page(String expectedTitle) {
		Loggerload.info("The user should be directed to {string} of Graph Page");

		Assert.assertEquals(expectedTitle,DriverFactory.getdriverTitle());
	}
	
	@Given("The user is on the {string} sub link of Graph page")
	public void the_user_is_on_the_sub_link_of_graph_page(String subLink) {
		Loggerload.info("The user is on the {string} sub link of Graph page");

	    gp.subLinkClick(subLink);
	}
	
	@Then("The user clicks Sign Out button")
	public void the_user_clicks_sign_out_button() {
		Loggerload.info("The user clicks Sign Out button");

		lp.clicklogout();

	}
}
