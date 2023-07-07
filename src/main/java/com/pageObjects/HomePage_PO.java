package com.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage_PO {
	public WebDriver driver;
	//web elements for home page.
	@FindBy (xpath="//h5[text()='Data Structures-Introduction']/..//a[text()='Get Started']")WebElement datastrgetstarted;
    @FindBy (xpath="//div[@class='alert alert-primary']")WebElement errormsg1;
	@FindBy(xpath="//h5[text()='Array']/..//a[text()='Get Started']")WebElement arraygetstarted;
	@FindBy (xpath="//h5[text()='Linked List']/..//a[text()='Get Started']")WebElement linklistgetstarted;
	@FindBy (xpath="//h5[text()='Stack']/..//a[text()='Get Started']")WebElement stackgetstarted;
	@FindBy (xpath="//h5[text()='Queue']/..//a[text()='Get Started']")WebElement queuegetstarted;
	@FindBy (xpath="//h5[text()='Tree']/..//a[text()='Get Started']")WebElement treegetstarted;
	@FindBy (xpath="//h5[text()='Graph']/..//a[text()='Get Started']")WebElement graphgetstarted;
	@FindBy (xpath="//a[text()='Sign in']")WebElement signin;
	@FindBy (xpath="//a[text()=' Register ']")WebElement register;
	@FindBy (linkText = "Data Structures") WebElement mainDropDown;
	 @FindBy (linkText = "Arrays") WebElement arrayDropDown;
	 @FindBy (linkText = "Linked List") WebElement linkedListDropDown;
	 @FindBy (linkText = "Stack") WebElement stackDropDown;
	 @FindBy (linkText = "Queue") WebElement queueDropDown;
	 @FindBy (linkText = "Tree") WebElement treeDropDown;
	 @FindBy (linkText = "Graph") WebElement graphDropDown;
	
	
	 public HomePage_PO(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);



}

public void clickgetstarted(String option) throws InterruptedException {
	
	
			
			switch(option) {
			case "Datastructures": datastrgetstarted.click();break;
			case "Arrays":arraygetstarted.click();break;
			case "Linked List":linklistgetstarted.click();break;
			

			case "Stack":
				/*
				 * Actions at = new Actions(driver);
				 * at.moveToElement(stackgetstarted).click().perform(); Thread.sleep(3000);
				 */
				/*
				 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				 * wait.until(ExpectedConditions.elementToBeClickable(stackgetstarted));
				 */
				stackgetstarted.click();break;

			case "Queue":
				/*
				 * Actions at1 = new Actions(driver);
				 * at1.moveToElement(queuegetstarted).click().perform(); Thread.sleep(3000);
				 */

				queuegetstarted.click();
				break;
			case "Tree":
				/*
				 * Actions at2 = new Actions(driver);
				 * at2.moveToElement(treegetstarted).click().perform(); Thread.sleep(3000);
				 */

				treegetstarted.click();
			break;
			case "Graph":graphgetstarted.click();break;
			
		}
			}

public String errormsg1() {
	return errormsg1.getText();
	
}
	public void signin() {
		signin.click();
	}
	public String Getpagetitle() {
		 return driver.getTitle();
	 }
	public void registerclick() {
		register.click();
	}
	public void mainDropDown() {
		  mainDropDown.click();
		 }
		 
		 public void dropDownSelection(String option) {
		  switch(option) {
		  case "Arrays": 
		   arrayDropDown.click();break;
		  case "Linked List": 
		   linkedListDropDown.click();break;
		  case "Stack": 
		   stackDropDown.click();break;
		  case "Queue": 
		   queueDropDown.click();break;
		  case "Tree": 
		   treeDropDown.click();break;
		  case "Graph": 
		   graphDropDown.click();break;
		  }
		 }
}



