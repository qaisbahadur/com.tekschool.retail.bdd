Feature: Retail Test Scenarios

Background:
Given User is on Retail website 

@RegisterForm
Scenario: Resgister Account for new Retail user

 When User click  on MyAccount 
 And User click on Register
 And User fill out Resgister form with below information 
 |firstName|lastName|email|phone|password|
 |Dunya|Khan|dunyakhan@gmail.com|20214157896|jankhan|
 And User select 'yes' for Subscibe 
 And User click on privacy and policy check box
 And User click on continue button 
 Then User should see massage 'Your Account Has Been Created'
 



