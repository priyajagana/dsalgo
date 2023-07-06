package stepDefinitions;
import com.pageObjects.DataStructure_PF;
import com.pageObjects.StackPage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.Loggerload;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DataStructures_SD {
	DataStructure_PF ds = new DataStructure_PF(DriverFactory.getDriver());
	TR_PF trpf = new TR_PF();
	private StackPage_PO sp=new StackPage_PO(DriverFactory.getDriver());

	
	@Given("User is clicks on Datastructuregetstarted button")
	public void user_is_clicks_on_datastructuregetstarted_button() {
		Loggerload.info("user opens datastructures");
	    ds.getStarted_ds();
	}

	@When("user clicks on time complexity sub module")
	public void user_clicks_on_time_complexity_sub_module() {
		Loggerload.info("user clicks time complexity datastructures");

	    ds.timecomplex();
	}

	@Then("user clicks on tryhere button")
	public void user_clicks_on_tryhere_button() {
		Loggerload.info("user clciks on try here ");

		//TR_PF trpf = new TR_PF();
		trpf.th();
	}

	@Given("user sends valid pythoncode and click on run button and print the output in console")
	public void user_sends_valid_pythoncode_and_click_on_run_button_and_print_the_output_in_console() {
		Loggerload.info("user enters valid python code ");
ds.dsinput1();
	    trpf.run();
	    ds.dsoutput1();
	}

	@When("user navigates refresh")
	public void user_navigates_refresh() {
		Loggerload.info("user navigates refresh ");

	    DriverFactory.refresh();
	}

	@Then("user sends invalid syntax and click on run button and capture the alert messsage")
	public void user_sends_invalid_syntax_and_click_on_run_button_and_capture_the_alert_messsage() {
		Loggerload.info("user sends invalid syntax and click on run button  ");
ds.dsinvalidinput();
	    trpf.run();
	    sp.geterrormsg();
	}

	@Then("user navigates back")
	public void user_navigates_back() {
		Loggerload.info("user navigates back ");

		 DriverFactory.navigateback();
	}

	@Given("user clicks on practice Questions")
	public void user_clicks_on_practice_questions() {
		Loggerload.info("clicks on practice Questions");

	    ds.dspracticeQ();
	}

	@Then("uset navigates back")
	public void uset_navigates_back() throws InterruptedException {
		Loggerload.info("usernavigates back");

	    DriverFactory.navigateback();
	    Thread.sleep(3000);	}


}
