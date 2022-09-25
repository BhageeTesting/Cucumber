Feature: Add Employee

Scenario Outline:
Validate add emp with multiple data
Given user navigates url "http://orangehrm.qedgetech.com/"
When user logs as username "Admin" and logs as password"Qedge123!@#"
When user click login button
When user click pim button
When user click add button
When user Enter "<FirstName>" and "<MiddleName>" and "<LastName>"
When user capture emid
When user click save button
When user capture emid aftersave
Then user valid emid
Then user close browser
Examples:
|FirstName|MiddleName|LastName|
|Bhagee1|Selenium1|Testing1|
|Prabhas|Actor|Uppalapati|
|ram|Actor|Pothineni|
|Charan|Actor|Konidela|
|Rana|Actor|Daggubati|