Feature: user log in with credentials
Scenario Outline: The user signin with registered credential
Given user is on signin page
When user enters the valid credentials "<username>" and "<password>"
Then click login to verify and page title should be "NumpyNinja"
 Examples: 
      | username   | password  |
      |Aadhya2@yahoo.com|AMMAMMA1 |
      
  Scenario: The user is directed to "Queue" Page
 Given The user is on the home page after logged in
 When The user select "Queue" item from the drop down menu
 Then The user should be directed to "Queue" Page
 
 Scenario: The user is able to navigate to Implementation of Queue in Python link page
 
 Given The user is in the "Queue" page after logged in
 When The user clicks on "Implementation of Queue in Python" link
 Then The user should be directed to "Implementation of Queue in Python" Page
 
 Scenario: The user should be directed to editor page with run button to test python code
  Given The user is on the "Implementation of Queue in Python" page in queue after logged in
  When The user clicks Try Here link
 Then The user should be redirected to a page having an tryEditor with a Run button to test 
 
 Scenario Outline: The user is able to run code in Editor for Implementation of queue page
 Given The user is in a page having an Editor with a Run Button to Test
 When The user gets input from sheet "<Sheetname>" and <RowNumber>
 And The user clicks on Run button after Entering valid python code in stack tryEditor
 Then The user should be presented with Run output
 Examples: 
 |Sheetname|RowNumber|
| pythonCode |         0 |

  Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation of queue page
  Given The user is in a page having an Editor with a Run Button to Test
 When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> 
And The user clicks on Run button after Entering invalid python code in stack tryEditor
Then The user should get the error message
Examples: 
| Sheetname  | RowNumber | 
| pythonCode |         1 |

 Scenario: The user is able to navigate to queue page and click on Implementation using collections deque link
  Given The user is in the "Queue" page after logged in
 When The user clicks on "Implementation using collections.deque" link
 Then The user should be directed to "Implementation using collections.deque" Page
 
 Scenario: The user should be directed to editor page with run button to test python code
  Given The user is on the "Implementation using collections.deque" page in queue after logged in
  When The user clicks Try Here link
 Then The user should be redirected to a page having an tryEditor with a Run button to test
  
 Scenario Outline: The user is able to run code in Editor for Implementation of queue page
 Given The user is in a page having an Editor with a Run Button to Test
 When The user gets input from sheet "<Sheetname>" and <RowNumber>
 And The user clicks on Run button after Entering valid python code in stack tryEditor
 Then The user should be presented with Run output
 Examples: 
 |Sheetname|RowNumber|
| pythonCode |         0 |

  Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation of queue page
  Given The user is in a page having an Editor with a Run Button to Test
 When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> 
And The user clicks on Run button after Entering invalid python code in stack tryEditor
Then The user should get the error message
Examples: 
| Sheetname  | RowNumber | 
| pythonCode |         1 |


Scenario: The user is able to navigate to queue page and click on Implementation using arrays link
  Given The user is in the "Queue" page after logged in
 When The user clicks on "Implementation using array" link
 Then The user should be directed to "Implementation using array" Page
 
 Scenario: The user should be directed to editor page with run button to test python code
  Given The user is on the "Implementation using array" page in queue after logged in
  When The user clicks Try Here link
 Then The user should be redirected to a page having an tryEditor with a Run button to test 

 Scenario Outline: The user is able to run code in Editor for Implementation of queue page
 Given The user is in a page having an Editor with a Run Button to Test
 When The user gets input from sheet "<Sheetname>" and <RowNumber>
 And The user clicks on Run button after Entering valid python code in stack tryEditor
 Then The user should be presented with Run output
 Examples: 
 |Sheetname|RowNumber|
| pythonCode |         0 |

  Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation of queue page
  Given The user is in a page having an Editor with a Run Button to Test
 When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> 
And The user clicks on Run button after Entering invalid python code in stack tryEditor
Then The user should get the error message
Examples: 
| Sheetname  | RowNumber | 
| pythonCode |         1 | 
Scenario: The user is able to navigate to queue page and click on Implementation using arrays link
   Given The user is in the "Queue" page after logged in
  When The user clicks on "Queue Operations" link
 Then The user should be directed to "Queue Operations" Page
 
 Scenario: The user should be directed to editor page with run button to test python code
  Given The user is on the "Queue Operations" page in queue after logged in
  When The user clicks Try Here link
 Then The user should be redirected to a page having an tryEditor with a Run button to test 
Scenario Outline: The user is able to run code in Editor for Implementation of queue page
 Given The user is in a page having an Editor with a Run Button to Test
 When The user gets input from sheet "<Sheetname>" and <RowNumber>
 And The user clicks on Run button after Entering valid python code in stack tryEditor
 Then The user should be presented with Run output
 Examples: 
 |Sheetname|RowNumber|
| pythonCode |         0 |

  Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation of queue page
  Given The user is in a page having an Editor with a Run Button to Test
 When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> 
And The user clicks on Run button after Entering invalid python code in stack tryEditor
Then The user should get the error message
Examples: 
| Sheetname  | RowNumber | 
| pythonCode |         1 | 
Scenario: The user is able to navigate to QueueOp page and click on Practice Questions

 Given The user is in the "Queue" page after logged in
When  The user clicks on "Implementation of Queue in Python" link
When The user clicks on the "Practice Questions" link
 Then The user should be directed to "Practice Questions" Page
 
 
 