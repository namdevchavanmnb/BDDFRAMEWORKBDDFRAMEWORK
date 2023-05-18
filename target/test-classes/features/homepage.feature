Feature: Home Page Feature
  Scenario: click on profile page
    Given launch url "https://www.instagram.com/" and login using username "namdevchavanmnb" and password "namdev@1234"
    When click on profile
    And Verify Home page Title "Instagram"
    Then home page close driver