Feature: Login functionality

Scenario: Login with valid credentials
Given User  navigates to login page
#When User has clicked on Login Link
When User enters valid email Id "sample100@test.com" into email field
When User has entered valid password "M12345" into password field
And User clicks on Login button
Then User should get successfully logged in

#Scenario: Login with invalid credentials
#Given User navigates to login page
#When User has clicked on Login Link
#When User enters invalid email Id "sample@test.com" into email field
#When User has entered invalid password "M123456" into password field
#And User clicks on Login button
#Then User should see the warning message Login was unsuccessful. Please correct the errors and try again.
#
#Scenario: Login with valid email Id and invalid password
#Given User navigates to login page
#When User has clicked on Login Link
#When User enters valid email Id "sample100@test.com" into email field
#And User has entered invalid password "M123456" into password field
#And User clicks on Login button
#Then User should see the warning message Login was unsuccessful. Please correct the errors and try again.
#
#Scenario: Login with invalid email Id and valid password
#Given User navigates to login page
#When User has clicked on Login Link
#When User enters invalid email Id "sample@test.com" into email field
#And User has entered valid password "M12345" into password field
#And User clicks on Login button
#Then User should see the warning message Login was unsuccessful. Please correct the errors and try again.
#
#
#Scenario: Login without providing credentials
#Given User navigates to login page
#When User has clicked on Login Link
#When User dont enter "sample@test.com" into email field
#And User has entered valid password "M12345" into password field
#And User clicks on Login button
#Then User should see the warning message Login was unsuccessful. Please correct the errors and try again.

