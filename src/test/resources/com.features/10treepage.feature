Feature: Testing the tree module


Scenario Outline: The user is able to signin with registered credential
Given The user is in signin page
When The user enters the valid credentials "<username>" and "<password>"
Then click login button to verify and page title should be "NumpyNinja"
 Examples: 
      | username   | password  |
      |Aadhya2@yahoo.com|AMMAMMA1 |
      


Scenario: The user is able to navigate to Overview of Trees page
Given The user is in the "Tree" page after logged in
When The user clicks in the "Overview of Trees" link
Then The user should be directed to "Overview of Trees" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is in the "Overview of Trees" page after logged in
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


Scenario: The user is able to navigate to Terminologies Page
Given The user is in the "Tree" page after logged in
When The user clicks in the "Terminologies" link
Then The user should be directed to "Terminologies" Page

Scenario: The user is able to navigate to Terminologies page having an tryEditor
Given The user is in the "Terminologies" page after logged in
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
					
Scenario: The user is able to navigate to Types of Trees Page
Given The user is in the "Tree" page after logged in
When The user clicks in the "Types of Trees" link
Then The user should be directed to "Types of Trees" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is in the "types of trees" page after logged in
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

Scenario: The user is able to navigate to Tree Traversals Page
Given The user is in the "Tree" page after logged in
When The user clicks in the "Tree Traversals" link
Then The user should be directed to "Tree Traversals" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is in the "tree traversals" page after logged in
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
Scenario:The user is able to navigate to "Traversals illustration" Page
Given The user is in the "Tree" page after logged in
When The user clicks in the "Traversals-Illustration" link
Then The user should be directed to "Traversals-Illustration" Page

Scenario: The user is able to navigate to a Page having an tryEditor
Given The user is in the "traversals illustration" page after logged in
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

Scenario: The user is able to navigate to "Binary trees" Page
Given The user is in the "Tree" page after logged in
When The user clicks in the "Binary Trees" link
Then The user should be directed to "Binary Trees" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is in the "binary trees" page after logged in
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

Scenario: The user is able to navigate to "Types of Binary trees" Page
Given The user is in the "Tree" page after logged in
When The user clicks in the "Types of Binary Trees" link
Then The user should be directed to "Types of Binary Trees" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is in the "types of binary trees" page after logged in
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
 
Scenario: The user is able to navigate to Implementation in Python Page
Given The user is in the "Tree" page after logged in
When The user clicks in the "Implementation in Python" link
Then The user should be directed to "Implementation in Python" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is in the "Implementation in Python" page after logged in
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
Scenario: The user is able to navigate to binary tree traversals Page
Given The user is in the "Tree" page after logged in
When The user clicks in the "Binary Tree Traversals" link
Then The user should be directed to "Binary Tree Traversals" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is in the "Binary Tree Traversals" page after logged in
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
	
Scenario: The user is able to navigate to Implementation of Binary Trees Page
Given The user is in the "Tree" page after logged in
When The user clicks in the "Implementation of Binary Trees" link
Then The user should be directed to "Implementation of Binary Trees" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is in the "Implementation of Binary Trees" page after logged in
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


Scenario: The user is able to navigate to Applications of Binary Trees Page
Given The user is in the "Tree" page after logged in
When The user clicks in the "Applications of Binary trees" link
Then The user should be directed to "Applications of Binary trees" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is in the "Applications of Binary Trees" page after logged in
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

Scenario: The user is able to navigate to "Binary Search Trees" Page
Given The user is in the "Tree" page after logged in
When The user clicks in the "Binary Search Trees" link
Then The user should be directed to "Binary Search Trees" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is in the "Binary Search Trees" page after logged in
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


Scenario: The user is able to navigate to "Implementation of BST" Page
Given The user is in the "Tree" page after logged in
When The user clicks in the "Implementation Of BST" link
Then The user should be directed to "Implementation Of BST" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is in the "Implementation Of BST" page after logged in
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
 
 Scenario: The user validating Practice Questions page
 Given The user is in the "Tree" page after logged in
 When The user clicks in the "Overview of Trees" link
 Then The user should be directed to "Practice Questions" of tree Page
















