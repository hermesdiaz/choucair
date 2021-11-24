@stories
Feature: Usuario puede crear una Reunion en la pagina StarSharp

  @scenario1
  Scenario Outline: Se crea una reunion de forma correcta
    Given un usuario se ha loggeado con la credenciales correctas
    When se crea una nueva unidad y se se asigna a una nueva reunion
<<<<<<< HEAD
<<<<<<< HEAD
    |usser|password|bussinesName|nombrereunion|nombrelocalizacion|direccionlocalizacion|tituloorganizado|nombreorganizado|segundonombreorganizado|tituloatendido|nombreatendido|segundonombreatendido|numerodereunion|tituloreportero|nombrereportero|segundonombrereportero|correo|dominio|nombrereunionesperado|
    |admin|serenity|Prueba44   |reunion de test|Villavicencio|Villavicencio|Test|Hermes|Diaz|Testeoo|Hermes|Diaz|20211122|Testeo|Hermes|Diaz|hermesdiaz|hotmail.com|reunion de test|
=======

      |usser |password |bussinesName|
      | <usser> | <password> | <bussinesName> |

>>>>>>> parent of 5d9a0ec (Proyecto .bad)
    Then se deberia crear una reunion nueva
    Examples:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
      |usser|password|bussinesName|nombrereunion|nombrelocalizacion|direccionlocalizacion|tituloorganizado|nombreorganizado|segundonombreorganizado|tituloatendido|nombreatendido|segundonombreatendido|numerodereunion|tituloreportero|nombrereportero|segundonombrereportero|correo|dominio|
      |admin|serenity|Prueba44   |reunion de test|Villavicencio|Villavicencio|Test|Hermes|Diaz|Testeoo|Hermes|Diaz|20211122|Testeo|Hermes|Diaz|hermesdiaz|hotmail.com|


=======

      |usser |password |bussinesName|
      | <usser> | <password> | <bussinesName> |

    Then se deberia crear una reunion nueva
    Examples:
      |usser|password|bussinesName|
      |admin|serenity|Prueba44   |
>>>>>>> parent of 117a8eb (Ejercicio finalizado)
=======
      |usser|password|bussinesName|
      |admin|serenity|Prueba44   |
>>>>>>> parent of 117a8eb (Ejercicio finalizado)
=======
      |usser|password|bussinesName|
      |admin|serenity|Prueba44   |
>>>>>>> parent of 117a8eb (Ejercicio finalizado)
=======
      |usser|password|bussinesName|
      |admin|serenity|Prueba44   |
>>>>>>> parent of 117a8eb (Ejercicio finalizado)

