
Feature: User tidak bisa lanjut kehalaman login karena tidak mengisi field email dan password

  
  Scenario Outline: User login tanpa mengisi credential
    Given User diarah kehalaman Login facebook
    When user tidak mengisi semua field
    And User Klik tombol login
    Then User mendapatkan inline error

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |