@stories
Feature: Usuario puede logearse en StarSharp page
  @scenario1
  Scenario Outline: Login correcto
    Given un usuario ingresa un nombre de usuario en el campo usuario and que ha introducido un password en el campo contrasena
    When se hace click en el boton
      |usser |password |
      | <usser> | <password> |
    Then deberia cargarse la pagina
    Examples:
      |usser||password|
      |admin||serenity|

