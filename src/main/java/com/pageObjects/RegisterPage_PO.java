package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RegisterPage_PO {
	private WebDriver driver;
	
	@FindBy(name="username")WebElement username;
	@FindBy(name="password1")WebElement password;
	@FindBy(name="password2")WebElement confirmpassword;
	@FindBy(xpath="//input [@value='Register']")WebElement Register;
    @FindBy (xpath="//div[@class='alert alert-primary']")WebElement errormsg1;

	
	public RegisterPage_PO(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
}
	public void registerbuttonclick() {
		Register.click();
	}
	public String Getpagetitle() {
		 return driver.getTitle();
	 }
	public String displayerror() {
		String errVal = username.getAttribute("required");
		if(errVal.equalsIgnoreCase("true")) {
			errVal = "Please fill out this field.";
		}
		return errVal;
	}
	public void enterusername(String name) {
		username.sendKeys(name);
	}
	public void enterpassword(String name) {
		password.sendKeys(name);
	}
	public void enterconfirmpassword(String name) {
		confirmpassword.sendKeys(name);
	}
	public String errormsg1() {
		return errormsg1.getText();
		
	}
}
