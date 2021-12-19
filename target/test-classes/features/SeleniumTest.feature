Feature: To check Selenium webdriver code

@seleniumtest1
Scenario: To check if browser works
Given webdriver is at placed in desired location
When webdriver should be intiated and started 
Then chromebrowser is started with desired url
And chromebrowser is closed


@seleniumtest1
Scenario: To check if browser works
Given webdriver is at placed in desired location
When webdriver should be intiated and started 
Then chromebrowser is started with desired url
And user searches item "Cucumber"
And user adds the item to cart
And user clicks cart icon
And user clicks on proceed to checkout
And chromebrowser is closed

@seleniumtest
Scenario: To check if browser works
Given webdriver is at placed in desired location
When webdriver should be intiated and started 
Then chromebrowser is started with desired url
And user searches item "Cucumber"
And user adds the item to cart
And user clicks cart icon
And user clicks on proceed to checkout
And user clicks on place order
And chromebrowser is closed