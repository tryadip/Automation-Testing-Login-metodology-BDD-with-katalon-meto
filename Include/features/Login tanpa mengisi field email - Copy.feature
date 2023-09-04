Feature: Login

  Scenario Outline: Login tanpa mengisi field email
    Given User diarahkan kehalaman login
    When User input field <password> tanpa mengisi field email
    And User klik button login
    Then User mendapatkan informasi <verify> inline error pada field email

    Examples: 
      | password | verify                                                                                                      |
      | dwadawd  | The email address or mobile number you entered isn't connected to an account. Find your account and log in. |
