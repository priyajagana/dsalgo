package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import com.pageObjects.HomePage_PO;
import com.pageObjects.LoginPage_PO;
import com.pageObjects.RegisterPage_PO;
import com.pageObjects.StackPage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;
import com.qa.util.Loggerload;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackPage_SD {
	private StackPage_PO sp=new StackPage_PO(DriverFactory.getDriver());
	private LoginPage_PO lp=new LoginPage_PO (DriverFactory.getDriver());
	 private RegisterPage_PO rp=new RegisterPage_PO (DriverFactory.getDriver());
		private HomePage_PO hp=new HomePage_PO(DriverFactory.getDriver());
//s
	@Given("The user is in signin page")
	 public void the_user_is_in_the_signin_page() {
		Loggerload.info("user opens stackpage");
			DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");    

	 }

	 @When("The user enters the valid credentials {string} and {string}")
	 public void the_user_enters_a_valid_and(String username, String password) {
			Loggerload.info("The user enters the valid credentials {string} and {string}");
 rp.enterusername(username);
	     lp.enterpassword(password);
	 }

	 @Then("click login button to verify and page title should be {string}")
	 public void click_login_button_to_verify(String titleofhomepage) {
			Loggerload.info("click login button to verify and page title should be {string}");
lp.clicklogin();
	     Assert.assertEquals(titleofhomepage,DriverFactory.getdriverTitle());
	     
	 }
	 @Given("The user is on the home page after logged in")
	 public void the_user_is_on_the_after_logged_in() {
			Loggerload.info("The user is on the home page after logged in");
DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");  
		rp.enterusername("Aadhya2@yahoo.com");
	     lp.enterpassword("AMMAMMA1");
       lp.clicklogin();
	 }

	 @When("The user select {string} item from the drop down menu")
	 public void the_user_select_stack_item_from_the_drop_down_menu(String module) {
			Loggerload.info("The user select {string} item from the drop down menu");

		 hp.mainDropDown();
		 hp.dropDownSelection(module);
	 }

	 @Then("The user should be directed to {string} Page")
	 public void the_user_should_be_directed_to_stack_page_and_page_title_is(String expectedtitle) {
			Loggerload.info("The user should be directed to {string} Page");
Assert.assertEquals(expectedtitle,DriverFactory.getdriverTitle());
	 }
	 @Given("The user is in the {string} page after logged in")
	 public void the_user_is_on_the_stack_page_after_logged_in(String module) {
			Loggerload.info("The user is in the {string} page after logged in");
hp.mainDropDown();
		 hp.dropDownSelection(module);
	 }

	 @When("The user clicks on the {string} link")
	 public void the_user_clicks_on_the_operations_in_stack_link(String module) throws InterruptedException {
		
			Loggerload.info("The user clicks on the {string} link");
  sp.submoduleclick(module);
	     
	 }

	 @Given("The user is on the {string} after logged in")
public void the_user_is_on_the_after_logged_in(String submodule) throws InterruptedException {
			Loggerload.info("The user is on the {string} after logged in");
 sp.submoduleclick(submodule);
}

@When("The user clicks Try Here button")
public void the_user_clicks_button_in_page() throws InterruptedException {
	Loggerload.info("The user clicks Try Here button");
sp.clicktryhere();
}


@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	Loggerload.info("The user should be redirected to a page having an tryEditor with a Run button to test");
boolean value1=sp.assessment();
	Assert.assertTrue(value1);
}
@Given("The user is in the Stack page after having an tryEditor with a Run button to test")
public void the_user_is_in_the_stack_page_after_having_an_try_editor_with_a_run_button_to_test() {
	Loggerload.info("The user is in the Stack page after having an tryEditor with a Run");
DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/tryEditor");    

}

@When("The user gets input from sheet {string} and {int}")
public void the_user_gets_input_from_sheet_and_row_number(String Sheetname,int RowNumber) throws InvalidFormatException, IOException, InterruptedException {
	Loggerload.info("The user gets input from sheet {string} and {int");
ExcelReader reader= new ExcelReader();
    List<Map<String,String>> testdata=reader.getData("C:\\Users\\priya\\OneDrive\\Desktop\\stackandqueue.xlsx",Sheetname);
    
    String code1=testdata.get(RowNumber).get("code");
    sp.enterdatatotryeditor(code1);
}

@And("The user clicks on Run button after Entering valid python code in stack tryEditor")
public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_stack_try_editor() {
	Loggerload.info("The user clicks on Run button after Entering valid python code in stack tryEditor");
sp.clickrunbtn(); 
}

@Then("The user should be presented with Run output")
public void the_user_should_be_presented_with_run_output() {
	Loggerload.info("The user should be presented with Run output");
 sp.output();
}

@When("The user gets invalid input from sheet {string} and {int}")
public void the_user_gets_invalid_input_from_sheet_and_row_number(String Sheetname,int RowNumber)throws InvalidFormatException, IOException, InterruptedException {
	Loggerload.info("The user gets invalid input from sheet {string} and {int");
ExcelReader reader= new ExcelReader();
    List<Map<String,String>> testdata=reader.getData("C:\\Users\\priya\\OneDrive\\Desktop\\stackandqueue.xlsx",Sheetname);
    
    String code1=testdata.get(RowNumber).get("code");
    sp.enterdatatotryeditor(code1);
}

@When("The user clicks on Run button after Entering invalid python code in stack tryEditor")
public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_stack_try_editor() {
	Loggerload.info("The user clicks on Run button after Entering invalid python code");
 sp.clickrunbtn(); 
}

@Then("The user should get the error message")
public void the_user_should_get_the_error_message() throws InterruptedException {
	Loggerload.info("The user should get the error message");
sp.geterrormsg();
	DriverFactory.navigateback();
}

}
