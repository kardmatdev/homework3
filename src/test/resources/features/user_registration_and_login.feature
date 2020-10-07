Feature: Uzytkownik zostanie zrejestrowany w serwisie i nastapi poprawne zalogowanie nowo utworzonego uzytkownika

  Scenario: Uzytkownik uzywajac przyciskow Create Account zostanie zarejestrowany w serwisie

    Given Użytkownik otwiera strone domowa serwisu
    When Uzytkownik nacisnie przycisk Sign In
    And Uzytkownik wprowadzi adres e-mail i nacisnie przycisk Create an account
    And Uzytkownik wypelni wszystkie wymagane pola i nacisnie przycisk Register
    Then Uzytkownik zostanie zarejestrowany i przeniesiony do widoku MyAccount

    Scenario: Użytkownik po rejestracji zaloguje loginem i hasłem, które uzyskał wcześniej
      Given Użytkownik znajduje się na stronie domowej serwisu
      When Użytkownik naciska na przycisk Sign In
      And Użytkownik wprowadzi login i hasło i naciśnie przycisk Sign In
      Then Uzytkownik zostanie zalogowany i zostanie przeniesiony do widoku MyAccount
