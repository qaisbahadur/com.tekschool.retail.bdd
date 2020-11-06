Feature: Retail Test Scenarios

Background:
Given User is on Retail website 

@RegisterForm
Scenario: Resgister Account for new Retail user

 When User click on MyAccount 
 And User click on Register
 And User fill out Resgister form with below information 
 |firstName|lastName|email                 |phone     |password|
 |Dunyas   |Khans   |dunyakhasadn@gmail.com|2021415000|jankhan |
 And User select 'yes' for Subscibe 
 And User click on privacy and policy check box
 And User click on continue button 
 Then User should see massage 'Your Account Has Been Created'
 
 
 @AddProduct
 Scenario: Add Products to Shopping Cart
 
 When User clicks on a Prduct Menu Item
 And User clicks on a Product
 And User clicks on Add to Cart
 And Item is added to Cart
 Then User sees a message ‘Success 'You have added iMac to your shopping cart!'


@RemoveProduct
Scenario: Product from Shopping Cart

When User click on Shopping cart menu
And User see list of item is displayed 
Then User click on Red X button




 
 
 



