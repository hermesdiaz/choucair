@stories
Feature: Usuario puede crear una Reunion en la pagina StarSharp

  @scenario1
  Scenario Outline: Se crea una reunion de forma correcta
    Given un usuario se ha loggeado con la credenciales correctas
    When se crea una nueva unidad y se se asigna a una nueva reunion

      |usser |password |bussinesName|
      | <usser> | <password> | <bussinesName> |

    Then se deberia crear una reunion nueva
    Examples:
      |usser|password|bussinesName|
      |admin|serenity|Prueba44   |

