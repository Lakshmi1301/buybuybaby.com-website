Feature: verifying the buybuybaby website

  Background: 
   Given    User is on buybuyBABY website


  Scenario: verifying on the buybuybaby SignInPage
    When    User Clicks the Sign In button
    When    User Enters the EmailId and password
    And     User Clicks the LoginIn button
    
    
    
    
    And    User moves to Categories button
    And    User moves to Bath & Potty button
    And     User move to Bath Tubs & Accessories button
    And     User Clicks the Bath Safety button
    And    User move to the Price dropdown button,select the options  and click on the option selected
    And     User Clicks one selected product
    And     user moves to qnt dropdown box
    And     user clicks the qnt
    And     user clicks on the shipit button
    And     user clicks on the viewcard and checkout button
    
   
    