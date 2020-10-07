Feature: Bez logowania i po dodaniu produktów płacenie jest niemożliwe bez autoryzacji

  Scenario: Sprawdznie, czy bez logowania po dodaniu produktów do koszyka i przejściu do kasy zostaniemy poproszeni o zalogowanie

    Given Użytkownik otwiera strone domowa serwisu
    When Użytkownik przechodzi do kategorii WOMEN
    And Użytkownik dodaje wszystkie produkty widoczne na stronie
    And Użytkownik przejdzie do koszyka
    And Użytkownik kliknie przejdź do kasy
    Then Pojawi się okno wymagające zalogowania