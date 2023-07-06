Feature: Testing Linked List Module

Scenario Outline: The user is able to signin with registered credential
Given The user is in signin page
When The user enters the valid credentials "<username>" and "<password>"
Then click login button to verify and page title should be "NumpyNinja"
 Examples: 
      | username   | password  |
      |Aadhya2@yahoo.com|AMMAMMA1 |
      
Scenario: User navigated to "linked list" page
 Given The user is on the home page after logged in
When The user select "Linked List" item from the drop down menu
Then The user should be directed to "Linked List" Page

Scenario: User navigated to "Introduction" page
Given The user is in the "Linked List" page after logged in
When The user clicks "Introduction" link of Linked List page
Then The user should be directed to "Introduction" Page

Scenario:  User navigated to tryEditor page with Run button from Introduction page
Given The user is on the "Introduction" page of Linked List after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user is able to run code in tryEditor
 Given The user is in the Stack page after having an tryEditor with a Run button to test
 When The user gets input from sheet "<Sheetname>" and <RowNumber>
 And The user clicks on Run button after Entering valid python code in stack tryEditor
 Then The user should be presented with Run output
 Examples: 
 |Sheetname|RowNumber|
| pythonCode |         0 |

Scenario Outline: The user is able to get the error message for invalid syntax
Given The user is in the Stack page after having an tryEditor with a Run button to test
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> 
And The user clicks on Run button after Entering invalid python code in stack tryEditor
Then The user should get the error message
Examples: 
| Sheetname  | RowNumber | 
| pythonCode |         1 |      
Scenario: User navigated to "Creating Linked LIst" page
Given The user is in the "Linked List" page after logged in
When The user clicks "Creating Linked LIst" link of Linked List page
Then The user should be directed to "Creating Linked LIst" Page

Scenario: User navigated to tryEditor page with Run button from Creating a Linked List page
Given The user is on the "Creating a Linked List" page of Linked List after logged in
When The user clicks Try Here button
Then 	The user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user is able to run code in tryEditor
 Given The user is in the Stack page after having an tryEditor with a Run button to test
 When The user gets input from sheet "<Sheetname>" and <RowNumber>
 And The user clicks on Run button after Entering valid python code in stack tryEditor
 Then The user should be presented with Run output
 Examples: 
 |Sheetname|RowNumber|
| pythonCode |         0 |

Scenario Outline: The user is able to get the error message for invalid syntax
Given The user is in the Stack page after having an tryEditor with a Run button to test
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> 
And The user clicks on Run button after Entering invalid python code in stack tryEditor
Then The user should get the error message
Examples: 
| Sheetname  | RowNumber | 
| pythonCode |         1 |
Scenario: User navigated to "Types of linked list" page
Given The user is in the "Linked List" page after logged in
When The user clicks "Types of Linked List" link of Linked List page
Then The user should be directed to "Types of Linked List" Page

Scenario: User navigated to tryEditor page with Run button from Types of Linked List
Given The user is on the "Types of Linked list" page of Linked List after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user is able to run code in tryEditor
 Given The user is in the Stack page after having an tryEditor with a Run button to test
 When The user gets input from sheet "<Sheetname>" and <RowNumber>
 And The user clicks on Run button after Entering valid python code in stack tryEditor
 Then The user should be presented with Run output
 Examples: 
 |Sheetname|RowNumber|
| pythonCode |         0 |

Scenario Outline: The user is able to get the error message for invalid syntax
Given The user is in the Stack page after having an tryEditor with a Run button to test
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> 
And The user clicks on Run button after Entering invalid python code in stack tryEditor
Then The user should get the error message
Examples: 
| Sheetname  | RowNumber | 
| pythonCode |         1 |
Scenario: user navigated to "Implementation linked list in python" page
Given The user is in the "Linked List" page after logged in
When The user clicks "Implement Linked List in Python" link of Linked List page
Then The user should be directed to "Implement Linked List in Python" Page

Scenario: User navigated to tryEditor page with Run button from Types of Linked List
Given The user is on the "Implement Linked List in Python" page of Linked List after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user is able to run code in tryEditor
 Given The user is in the Stack page after having an tryEditor with a Run button to test
 When The user gets input from sheet "<Sheetname>" and <RowNumber>
 And The user clicks on Run button after Entering valid python code in stack tryEditor
 Then The user should be presented with Run output
 Examples: 
 |Sheetname|RowNumber|
| pythonCode |         0 |

Scenario Outline: The user is able to get the error message for invalid syntax
Given The user is in the Stack page after having an tryEditor with a Run button to test
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> 
And The user clicks on Run button after Entering invalid python code in stack tryEditor
Then The user should get the error message
Examples: 
| Sheetname  | RowNumber | 
| pythonCode |         1 |
Scenario: user navigated to "Traversal" page
Given The user is in the "Linked List" page after logged in
When The user clicks "Traversal" link of Linked List page
Then The user should be directed to "Traversal" Page

Scenario: User navigated to tryEditor page with Run button from Types of Linked List
Given The user is on the "Traversal" page of Linked List after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user is able to run code in tryEditor
 Given The user is in the Stack page after having an tryEditor with a Run button to test
 When The user gets input from sheet "<Sheetname>" and <RowNumber>
 And The user clicks on Run button after Entering valid python code in stack tryEditor
 Then The user should be presented with Run output
 Examples: 
 |Sheetname|RowNumber|
| pythonCode |         0 |

Scenario Outline: The user is able to get the error message for invalid syntax
Given The user is in the Stack page after having an tryEditor with a Run button to test
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> 
And The user clicks on Run button after Entering invalid python code in stack tryEditor
Then The user should get the error message
Examples: 
| Sheetname  | RowNumber | 
| pythonCode |         1 |      
Scenario: user navigated to "Insertion" page
Given The user is in the "Linked List" page after logged in
When The user clicks "Insertion" link of Linked List page
Then The user should be directed to "Insertion" Page

Scenario: User navigated to tryEditor page with Run button from Types of Linked List
Given The user is on the "Insertion" page of Linked List after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user is able to run code in tryEditor
 Given The user is in the Stack page after having an tryEditor with a Run button to test
 When The user gets input from sheet "<Sheetname>" and <RowNumber>
 And The user clicks on Run button after Entering valid python code in stack tryEditor
 Then The user should be presented with Run output
 Examples: 
 |Sheetname|RowNumber|
| pythonCode |         0 |

Scenario Outline: The user is able to get the error message for invalid syntax
Given The user is in the Stack page after having an tryEditor with a Run button to test
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> 
And The user clicks on Run button after Entering invalid python code in stack tryEditor
Then The user should get the error message
Examples: 
| Sheetname  | RowNumber | 
| pythonCode |         1 |      
Scenario: user navigated to "Deletion" page
Given The user is in the "Linked List" page after logged in
When The user clicks "Deletion" link of Linked List page
Then The user should be directed to "Deletion" Page

Scenario: User navigated to tryEditor page with Run button from Types of Linked List
Given The user is on the "Deletion" page of Linked List after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user is able to run code in tryEditor
 Given The user is in the Stack page after having an tryEditor with a Run button to test
 When The user gets input from sheet "<Sheetname>" and <RowNumber>
 And The user clicks on Run button after Entering valid python code in stack tryEditor
 Then The user should be presented with Run output
 Examples: 
 |Sheetname|RowNumber|
| pythonCode |         0 |

Scenario Outline: The user is able to get the error message for invalid syntax
Given The user is in the Stack page after having an tryEditor with a Run button to test
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> 
And The user clicks on Run button after Entering invalid python code in stack tryEditor
Then The user should get the error message
Examples: 
| Sheetname  | RowNumber | 
| pythonCode |         1 |
Scenario: The user validating "Practice Questions" page
Given The user is in the "Linked List" page after logged in
When The user clicks "Introduction" link of Linked List page
And The user clicks on the "Practice Questions" link
Then The user should be directed to "Practice Questions" Page