Feature: User Login dengan mengunakan data invalid

  Scenario Outline: Login dengan Invalid data
    Given User diarahkan kehalaman invalid password
    When User mengisi field <email> dan <password> tidak valid
    And Klik button Login
    Then User diarahkkan kehalaman invalid credential

    Examples: 
      | email             | password     |
      | tryadip@gmail.com | dadjaijdiajd |
