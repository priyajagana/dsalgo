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
import com.pageObjects.TreePage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;
import com.qa.util.Loggerload;

import io.cucumber.java.en.*;

public class TreePage_SD {
	HomePage_PO hp=new HomePage_PO(DriverFactory.getDriver());
	TreePage_PO tm=new TreePage_PO(DriverFactory.getDriver());
	LoginPage_PO lp=new LoginPage_PO(DriverFactory.getDriver());
	RegisterPage_PO rp=new RegisterPage_PO(DriverFactory.getDriver());
	private StackPage_PO sp=new StackPage_PO(DriverFactory.getDriver());

	Boolean value;
	
	/*
	 * @Given("The user is in  Home page with valid  log in {string}  and {string}")
	 * public void the_user_is_in_the_home_page_with_valid_log_in_and(String
	 * username, String password) {
	 * 
	 * DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
	 * rp.enterusername(username); lp.enterpassword(password); lp.clicklogin(); }
	 */		/*
		 * @When("The user select Tree item from the drop down menu") public void
		 * the_user_select_tree_item_from_the_drop_down_menu() { hp.mainDropDown();
		 * hp.dropDownSelection("Tree");
		 * 
		 * }
		 */
		
	/*
	 * @Then("The user should be directed to {string} Page") public void
	 * the_user_should_be_directed_to_page(String expectedTitle) {
	 * Assert.assertEquals(expectedTitle,DriverFactory.getdriverTitle()); }
	 * 
	 * @Given("The user is in the {string} page after logged in") public void
	 * the_user_is_in_the_after_logged_in(String module) { hp.mainDropDown();
	 * hp.dropDownSelection(module); }
	 */
	
	@Given("The user is on the {string} page after logged in") public void
	 the_user_is_on_the_after_logged_in(String submodule) { 
		Loggerload.info("The user is on the {string} page after logged in");//hp.mainDropDown();
	 tm.submoduleclick(submodule); }
	 
	 

	
	
	
	  @When("The user clicks in the {string} link") public void
	  the_user_clicks_on_the_link(String name) { 		
		  Loggerload.info("The user clicks in the {string} link");//hp.mainDropDown();
tm.submoduleclick(name); }
	 
	
	/*
	 * @Then("The user should then be directed to {string} Page") public void
	 * the_user_should_then_be_directed_to_page(String expectedTitle) {
	 * Assert.assertEquals(expectedTitle,DriverFactory.getdriverTitle()); }
	 * 
	 */


	/*
	 * @When("The user clicks Try Here button in {string} page") public void
	 * the_user_clicks_try_here_button_in_page(String string) { tm.tryhereclick(); }
	 */
	/*
	 * @Then("The user should be redirected to a page having an tryEditor with a Run button to test"
	 * ) public void
	 * the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test
	 * () { value=tm.assessment(); Assert.assertTrue(value);
	 * 
	 * }
	 */ /*
		 * @Given("The user is in trees page having an tryEditor with a Run button to test"
		 * ) public void
		 * the_user_is_in_trees_page_having_an_try_editor_with_a_run_button_to_test() {
		 * DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/tryEditor");
		 * }
		 */
	/*
	 * @When("The user gets input from sheet {string} and {int} in trees") public
	 * void the_user_gets_input_from_sheet_and_in_trees(String sheetname, Integer
	 * rownumber) throws IOException, InvalidFormatException, InterruptedException {
	 * ExcelReader reader=new ExcelReader();
	 * 
	 * List<Map<String,String>>
	 * data=reader.getData("C:\\Users\\vijay\\OneDrive\\Desktop\\Examples.xlsx" ,
	 * sheetname); String cellvalue1=data.get(rownumber).get("values1");
	 * tm.enterdatatoeditor(cellvalue1); }
	 */
/*
 * @When("The user clicks on Run button after Entering  python code in trees tryEditor"
 * ) public void
 * the_user_clicks_on_run_button_after_entering_valid_python_code_in_trees_try_editor
 * () { tm.runclick();
 * 
 * }
 */
/*
 * @Then("The user should be presented with Run output for trees") public void
 * the_user_should_be_presented_with_run_output_for_trees() {
 * Assert.assertTrue(tm.output()); }
 */

			/*
			 * @When("The user gets invalid input from sheet {string} and {int} in trees")
			 * public void the_user_gets_invalid_input_from_sheet_and_in_trees(String
			 * sheetname, Integer rownumber) throws IOException, InvalidFormatException,
			 * InterruptedException { ExcelReader reader=new ExcelReader();
			 * 
			 * List<Map<String,String>>
			 * data=reader.getData("C:\\Users\\vijay\\OneDrive\\Desktop\\Examples.xlsx" ,
			 * sheetname); String cellvalue1=data.get(rownumber).get("values1"); //String
			 * datatoenter="print '"+cellvalue1.toString()+"'";
			 * tm.enterinvaliddatatoeditor(cellvalue1); }
			 */
			/*
			 * @Then("The user should get the error message for trees") public void
			 * the_user_should_get_the_error_message_for_trees() { sp.geterrormsg();
			 * DriverFactory.navigateback(); }
			 */
	@Then("The user should be directed to {string} of tree Page")
	public void the_user_should_be_directed_to_of_tree_page(String string) {
		Loggerload.info("The user should be directed to {string} of tree Page");//hp.mainDropDown();

	    tm.submoduleclick(string);
	}





}
