@UITest @E2ETest
Feature:Google_Feature

  Scenario:TC_01_Google_Search
    Given user goes to "https://google.com"
    Then user closes the application