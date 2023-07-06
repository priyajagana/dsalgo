Feature: user login with credentials
Scenario Outline: The user is able to signin with registered credential
Given The user is in the signin page
When The user enters a valid "<username>" and "<password>"
Then click login button to verify and page title is "NumpyNinja"
 Examples: 
      | username   | password  |
      |Aadhya2@yahoo.com|AMMAMMA1 |
      
 Scenario: The user goes to registration page when register is clicked
 Given The user is in the signin page
 When The user clicks on register link on signin page 
 Then The user redirected to Registration page from signin page and title is "Registration"
 
Scenario Outline: User on login page and login with invalid inputs
Given The user is in the signin page
When The user enter invalid "<username>" and "<password>" and click login
Then verify errormsg "Invalid Username and Password"
 Examples: 
      | username | password |
      | user     |	test				|
      | krate         | passowrd |
      |   night       |			date		|
 Scenario Outline: User on login page and login with invalid and valid inputs from Excel 
 Given The user is in the signin page
 When The user enter sheet "<Sheetname>" and <RowNumber>
 Then click login button to verify 
 
 Examples: 
      | Sheetname | RowNumber |
      | sheet1    |         0 |
      | sheet1    |         1 |
      | sheet1    |         2 |
      | sheet1    |         3 |
  Scenario: Verifying signout link
Given The user is in the Home page with valid  log in "Aadhya2@yahoo.com" and "AMMAMMA1"
When The user clicks Sign out
 
  
