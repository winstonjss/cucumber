Feature: Dividir
  Descripcion del escenario: Vamos a realizar una división

  Scenario: Dividir dos números enteros correctamente
    Given Quiero dividir Numeros Enteros
    When Divido 10 entre 2
    Then Deberia ver el resultado de 5.0

  Scenario: Intentar dividir un número entre cero
    Given Quiero dividir por 0
    When Divido cero 10 entre 0
    Then Deberia ver un error "No se puede dividir por cero"
