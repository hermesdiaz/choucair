@stories
Feature: Usuario puede crear una Reunion en la pagina StarSharp
Background:
  Given un usuario se ha loggeado con la credenciales correctas
  @scenario1
  Scenario : Se crea una reunion de forma correcta
    When se crea una nueva unidad y se se asigna a una nueva reunion
<<<<<<< HEAD
    |usser|password|bussinesName|nombrereunion|nombrelocalizacion|direccionlocalizacion|tituloorganizado|nombreorganizado|segundonombreorganizado|tituloatendido|nombreatendido|segundonombreatendido|numerodereunion|tituloreportero|nombrereportero|segundonombrereportero|correo|dominio|nombrereunionesperado|
    |admin|serenity|Prueba44   |reunion de test|Villavicencio|Villavicencio|Test|Hermes|Diaz|Testeoo|Hermes|Diaz|20211122|Testeo|Hermes|Diaz|hermesdiaz|hotmail.com|reunion de test|
    Then se deberia crear una reunion nueva
    |nombrereunionesperado|
    |reunion de test|

=======

      |usser |password |bussinesName|
      | <usser> | <password> | <bussinesName> |

    Then se deberia crear una reunion nueva
    Examples:
      |usser|password|bussinesName|
      |admin|serenity|Prueba44   |
>>>>>>> parent of 117a8eb (Ejercicio finalizado)

