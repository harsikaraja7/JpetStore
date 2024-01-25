Feature: Verifying Jpetstore SignIn Automation

Scenario Outline: Verifying SignIn with valid credentials

Given User is on the Jpetstore page
When User signin "userName" and "passWord"
Then User should verify success message after SignIn "Welcome yiqi!"

Examples: 
|userName|password|
|j2ee    |j2ee    |

@1
Scenario Outline: Verifying SignIn with valid credentials taken from excel

Given User is on the Jpetstore page
When User signin userName and passWord
Then User should verify success message after SignIn "Welcome yiqi!"

