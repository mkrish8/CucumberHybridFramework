Feature: Registration Functionality

Scenario: User create an account only with mandatory fields
Given User navigates to Register account page
When User enters the details into below fields
|firstName|Teju              |
|lastName |M										 |
|email    |sample@test.com|
|telephone|1234567890						 |
|password |12345								 |
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully

#Scenario: User create an account with all fields
#Given User navigates to Register account page
#When User enters the details into below fields
#|firstName|Teju               |
#|lastName |M										 |
#|email    |kkkkkkkk|
#|telephone|1234567890						 |
#|password |12345								 |
#And User selects YES for Newsletter
#And User selects Privacy Policy
#And User clicks on Continue button
#Then User account should get created successfully
#
#
#Scenario: User creates  duplicate account
#Given User navigates to Register account page
#When User enters the details into below fields
#|firstName|Teju               |
#|lastName |M										 |
#|email    |kkkkkkkkk|
#|telephone|1234567890						 |
#|password |12345								 |
#And User selects YES for Newsletter
#And User selects Privacy Policy
#And User clicks on Continue button
#Then User should get a proper warning about duplicate email

