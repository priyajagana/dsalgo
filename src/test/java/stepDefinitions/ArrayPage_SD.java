package stepDefinitions;

import io.cucumber.java.en.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.pageObjects.Array_PO;
import com.pageObjects.LinkedList_PO;
import com.pageObjects.StackPage_PO;
import com.qa.util.ExcelReader;
import com.qa.util.Loggerload;
import com.qa.factory.DriverFactory;


public class ArrayPage_SD extends TR_PF {
	
	Array_PO as = new Array_PO(DriverFactory.driver);
	private StackPage_PO sp=new StackPage_PO(DriverFactory.getDriver());

	TR_PF trpf = new TR_PF();
	String excelpath = "./src/test/resources/excel sheets/tryEditor (1).xlsx";
	String expectedcode;
	String actcode;
	String output;
	String result;
	private LinkedList_PO listpage = new LinkedList_PO(DriverFactory.getDriver());
	
	@Given("user clicks on the dropdown in array module")
	public void user_clicks_on_the_dropdown_in_array_module() throws InterruptedException {
		Loggerload.info("user clicks dropdown array page");
	  as.dropdown();
	  as.array(); 
	  }

	@Given("user clicks on array in python submodule and user clicks on tryhere button")
	public void user_clicks_on_array_in_python_submodule_and_user_clicks_on_tryhere_button() throws InterruptedException {
		Loggerload.info("user clicks submodule array page");
as.Ain_pyth();
	   trpf.th();	
	   }

	@When("user sends valid python code in try editor from excel sheet {string} and {int}")
	public void user_sends_valid_python_code_in_try_editor_from_excel_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		Loggerload.info("user enters python code array page");

		ExcelReader reader = new ExcelReader();
		
		//List<Map<String,String>> testData = reader.getData("/Users/sara/Sudha Selenium Training/SampleExcel/DS-Algo/tryEditor.xlsx", Sheetname);
		List<Map<String,String>> testData = reader.getData("./src/test/resources/excel sheets/tryEditor (1).xlsx", Sheetname);
	    String Data = testData.get(RowNumber).get("testData");
	    listpage.enterDataToTryEditor(Data);
		
	/*	List<Map<String,String>>testdata = reader.getData(excelpath, "pythonCode");
		String pycode = testdata.get(int1).get("pythoncode");
		String output= testdata.get(int1).get("output");
		//System.out.println(pycode);
		as.ar_input(pycode,output);	*/
		}
	
	@Then("user clicks on run button and user get the output in the console")
 	public void user_clicks_on_run_button_and_user_get_the_output_in_the_console() {
		Loggerload.info("user gets output array page");

    trpf.run();
    as.ar_output();
    DriverFactory.refresh();
    trpf.clear1(); 
    }

	@Given("user sends invalid syntax in try editor from excel sheet {string} and {int}")
	public void user_sends_invalid_syntax_in_try_editor_from_excel_sheet_and(String Sheetname, Integer RowNumber) throws InterruptedException, InvalidFormatException, IOException {
		Loggerload.info("user enetrs invalid syntax array page");

		trpf.clear1();
		ExcelReader reader = new ExcelReader();
		//List<Map<String,String>> testData = reader.getData("/Users/sara/Sudha Selenium Training/SampleExcel/DS-Algo/tryEditor.xlsx", Sheetname);
		List<Map<String,String>> testData = reader.getData("./src/test/resources/excel sheets/tryEditor (1).xlsx", Sheetname);
	    String Data = testData.get(RowNumber).get("testData");
	    listpage.enterDataToTryEditor(Data);
		/* List<Map<String,String>>testdata = reader.getData(excelpath, "Sheet1");
		String pycode = testdata.get(int1).get("pythoncode");
		String output= testdata.get(int1).get("output");
		//System.out.println(pycode);
		as.ar_input(pycode,output); */
		}
			
	@When("user clicks on run button")
	public void user_clicks_on_run_button() throws InterruptedException {
		Loggerload.info("user clicks run btn array page");

		trpf.run();	
		}

	@Then("user gets the alert message and navigates back")

	public void user_gets_the_alert_message_and_navigates_back() throws InterruptedException {
	   Loggerload.info("user gets alert msg array page");
       sp.geterrormsg();
		DriverFactory.navigateback();	
	   }

	@Given("user clicks on array using list submodule and user clicks on tryhere button")
	public void user_clicks_on_array_using_list_submodule_and_user_clicks_on_tryhere_button() {
		Loggerload.info("user gets alert msg array page");

		as.ar_list();
	   trpf.th();	
	   }

	@Then("user clicks on run button and capture the output in console")
	public void user_clicks_on_run_button_and_capture_the_output_in_console() throws InterruptedException {
		Loggerload.info("user gets output in array page");
trpf.run();
	   as.ar_output();	
	   DriverFactory.refresh(); 
	   }

	@Given("user clicks on Basic operations in list and user clicks on tryhere button")
	public void user_clicks_on_basic_operations_in_list_and_user_clicks_on_tryhere_button() {
		Loggerload.info("user clicks try here button in array page");
as.ar_oper();
	   trpf.th();	
	   }   

	@Given("user clicks on Application of array and user clicks on tryhere button")
	public void user_clicks_on_application_of_array_and_user_clicks_on_tryhere_button() {
	   
		Loggerload.info("user clicks try here button in array page");
as.app_ar();
	   trpf.th();	
	   }

	@Given("user clicks on Practice Question")
	public void user_clicks_on_practice_question() {
		Loggerload.info("user clicks practice que in array page");

	   as.a_PQ();	
	   }

	@When("user clicks on search the array and clear the try editor")
	public void user_clicks_on_search_the_array_and_clear_the_try_editor() {
		Loggerload.info("user clicks try editor in array page");

	   as.a_PQ1();
	   trpf.clear1(); 
	   }

	/*@Then("user sends valid python code in try editor from sheet {string} and {int}")
	public void user_sends_valid_python_code_in_try_editor_from_sheet_and(String string, Integer int1) throws  IOException, InvalidFormatException, InterruptedException {
		Thread.sleep(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>>testdata = reader.getData(excelpath, "Sheet1");
		String pycode = testdata.get(int1).get("pythoncode");
		String output= testdata.get(int1).get("output");
		//System.out.println(pycode);
		as.ar_input(pycode,output);	
		}*/
	
	@Then("user clicks on submit button and capture the output in console")
	public void user_clicks_on_submit_button_and_capture_the_output_in_console() throws InterruptedException {
		Loggerload.info("user captures output in array page");
Thread.sleep(1000);
	   as.submit();
	   Thread.sleep(1000);
	   as.ar_output();	
	   DriverFactory.refresh();
	   }
	
	@Given("user clicks on max consecutive ones and clear the try editor")
	public void user_clicks_on_max_consecutive_ones_and_clear_the_try_editor() throws InterruptedException {
		Loggerload.info("user clicks on max consecutive ones in array page");
as.a_PQ2();
	   Thread.sleep(1000);
	   trpf.clear1();	
	   }

	@Given("user clicks on Find numbers with even number of digits and clear the try editor")
	public void user_clicks_on_find_numbers_with_even_number_of_digits_and_clear_the_try_editor() throws InterruptedException {
		Loggerload.info("user clicks with even no of digits in array page");

		as.a_PQ3();
		Thread.sleep(1000);
		trpf.clear1();	
		}

	@Given("user clicks on the squares of sorted array and clear the try editor")
	public void user_clicks_on_the_squares_of_sorted_array_and_clear_the_try_editor() throws InterruptedException {
	   
		Loggerload.info("user clears the try editorss in array page");
as.a_PQ4();
	   Thread.sleep(1000);
	   trpf.clear1();	
	   }
}
	
