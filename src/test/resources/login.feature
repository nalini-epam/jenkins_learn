Feature: User can login to e-commerce site
  Scenario Outline: User can login with valid username and password
    Given User visited to the e-commerce site
    When Users inputs the valid "<username>" and "<password>"
    Then User can login successfully
    Examples:
        | username | password |
        | salauddin@test.com | 12345 |
        | testautouser1529@test.com | uqwV2%4d |