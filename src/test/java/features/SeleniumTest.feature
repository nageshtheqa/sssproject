Feature: To check Selenium webdriver code

@seleniumtest
Scenario: To check if browser works
Given webdriver is at placed in desired location
When webdriver should be intiated and started 
Then chromebrowser is started with desired url
And chromebrowser is closed