Feature: Login to Instagram
  Scenario: Login to Instagram application
    Given launch url "https://www.instagram.com/"
    When Enter User Name "namdevchavanmnb" and password "namdev@1234"
    And Verify Login page Title "Instagram"
    Then login and redirect to homepage
    Then login page close driver
