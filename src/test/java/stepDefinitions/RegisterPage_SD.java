package stepDefinitions;

import java.util.List;

import org.junit.Assert;

import com.pageObjects.RegisterPage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.Loggerload;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPage_SD{
 private RegisterPage_PO rp=new RegisterPage_PO (DriverFactory.getDriver());

	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		Loggerload.info("user opens register");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/register");    
 
	}
	//m

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty() {
		Loggerload.info("The user clicks Register button with all fields empty");
rp.registerbuttonclick();
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String error) {
		Loggerload.info("It should display an error {string} below Username textbox");
 String error1=rp.displayerror();
	    Assert.assertEquals(error,error1);
	}
	@When("The user clicks Register button after entering username with other fields empty")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty(io.cucumber.datatable.DataTable dataTable) {
		Loggerload.info("The user clicks Register button after entering username with other fields empty");
 List<String>rows=dataTable.asList(String.class);
	    rp.enterusername(rows.get(1));
	    rp.registerbuttonclick();
	    }

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String error) {
		Loggerload.info("It should display an error {string} below Password textbox");
		String error1=rp.displayerror();
	    Assert.assertEquals(error,error1);
	}
	
@When("The user enters a username with characters other than Letters, digits and special characters")
public void the_user_enters_a_username_with_characters_other_than_letters_digits_and(io.cucumber.datatable.DataTable dataTable) {
	Loggerload.info("The user enters a username with characters other than Letters, digits and special");
List<List<String>> data=dataTable.asLists(String.class);
    rp.enterusername(data.get(1).get(0));
    rp.enterpassword(data.get(1).get(1));
    rp.enterconfirmpassword(data.get(1).get(2));
    rp.registerbuttonclick(); 
}

@Then("It should display an error message {string}")
public void it_should_display_an_error_message(String error) {
	Loggerload.info("It should display an error message {string}");
String error1=rp.errormsg1();
    Assert.assertEquals(error,error1);

}
@When("The user clicks Register button after entering valid username and different passwords in password and password confirmation fields")
public void the_user_clicks_register_button_after_entering_valid_username_and_different_passwords_in_password_and_password_confirmation_fields(io.cucumber.datatable.DataTable dataTable) {
	Loggerload.info("The user clicks Register button after entering valid username and different passwords in password and password confirmation fields");
List<List<String>> data=dataTable.asLists(String.class);
    rp.enterusername(data.get(1).get(0));
    rp.enterpassword(data.get(1).get(1));
    rp.enterconfirmpassword(data.get(1).get(2));
    rp.registerbuttonclick();
    }
@When("The user enters a valid username and password and password confirmation")
public void the_user_enters_a_valid_username_and_password_and_password_confirmation(io.cucumber.datatable.DataTable dataTable) {
	Loggerload.info("The user enters a valid username and password and password confirmation");
List<List<String>> data=dataTable.asLists(String.class);
    rp.enterusername(data.get(1).get(0));
    rp.enterpassword(data.get(1).get(1));
    rp.enterconfirmpassword(data.get(1).get(2));
    rp.registerbuttonclick();
    
}

@Then("The user should be redirected to Homepage and pagetitle is {string}")
public void the_user_should_be_redirected_to_homepage_with_the_message(String titleofhomepage) {
    //rp.Getpagetitle();
	Loggerload.info("The user should be redirected to Homepage and pagetitle is {string}");
Assert.assertEquals(titleofhomepage,DriverFactory.getdriverTitle());

}

	
	

}
