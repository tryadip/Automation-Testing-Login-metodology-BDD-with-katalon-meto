
@tag
Feature: user berhasil diarahkan kehalaman login

  @tag1
  Scenario Outline: user mencari halaman facebook dan diarahkan kehalaman login
    Given User mencari halaman <url> facebook
    When User klik enter pada pencarian
    Then User pindah ke halaman <login>

    Examples: 
      | url | login |
      | www.facebook.com | Log in |