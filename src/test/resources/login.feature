Feature: User can login to e-commerce site
  Scenario Outline: User can login with valid username and password
    Given User visited to the e-commerce site
    When Users inputs the valid "<username>" and "<password>"

    Examples:
        | username | password |
        | Admin | admin123 |
