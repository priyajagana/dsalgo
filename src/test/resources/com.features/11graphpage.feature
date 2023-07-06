Feature: Exploring Graph module

Scenario: User navigated to "Graph" page
Given The user is on the home page after logged in
 When The user select "Graph" item from the drop down menu
Then The user should be directed to "Graph" Page

Scenario: The user is able to navigate to Graph page 
Given The user is in the "Graph" page after logged in
When The user clicks "Graph" sub link of Graph Page
Then The user should be directed to "Graph" of Graph Page

Scenario:  The user should be directed to editor page with run button to test python code
Given The user is on the "Graph" sub link of Graph page
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
      
Scenario: The user is able to navigate to Graph page 
Given The user is in the "Graph" page after logged in
When The user clicks "Graph Representations" sub link of Graph Page
Then The user should be directed to "Graph Representations" of Graph Page

Scenario:  User navigated to tryEditor page with Run button from Graph page
Given The user is on the "Graph Representations" sub link of Graph page
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
Given The user is in the "Graph" page after logged in
When The user clicks "Graph Representations" sub link of Graph Page
And The user clicks on the "Practice Questions" link
Then The user should be directed to "Practice Questions" Page
And The user clicks Sign Out button