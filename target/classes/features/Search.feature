#Feature: Search functionality
#
#Scenario: User searches for a valid product
#Given User opens the Application
#When User enters valid product "CSA C22.1:24" into seatch box field
#And User cliks on searh button
#Then User should get valid product displayed in search results

Feature: Search functionality

Scenario Outline: User searches for a valid product
Given User opens the Application
When User enters valid product <SearchProduct> into seatch box field
And User cliks on searh button
Then User should get valid product displayed in search results
Examples:
|SearchProduct|
|C22.1|
|C22.1:21|
|S6|
|B149.1:20|