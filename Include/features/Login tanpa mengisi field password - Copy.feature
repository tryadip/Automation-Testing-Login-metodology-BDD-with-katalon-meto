Feature: Login tanpa mengisi field password akan menampilkan halaman send code email

  Scenario Outline: Login dengan mengosongkan field password
    Given User diarahkan ke halaman login facebook
    When User mengisi field <email> dan mengosongkan field <password>
    And User klik btn login
    Then User diarahkan kehalaman <sendcode> ke email

    Examples: 
      | email                 | pass          | sendcode                                                                                   |
      | tryadisssaa@gmail.com | dwadadadwadaw | The email address you entered isn't connected to an account. Find your account and log in. |
