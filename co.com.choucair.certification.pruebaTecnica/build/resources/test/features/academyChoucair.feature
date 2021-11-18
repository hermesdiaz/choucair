# Autor: Hermes Arnul Diaz Barreto
@stories

Feature: Account creation on uTest page
  As a web user, I want to register on the uTest page to get an account.
  @scenario1
  Scenario Outline: Simple google search
    Given a web browser on the uTest page
    When you click on the Joid Today option and the information is filled out
      | strNombre  | strApellido  | strEmail  | strMes | strDia | strAno| strCiudad | strCodigoPostal| strPais| strComputer | strVersion  | strLanguagePc | strMobileDevice  | strModel  | strOS  | strPassword|
      | <strNombre> | <strApellido> | <strEmail> | <strMes> | <strDia> | <strAno> | <strCiudad> | <strCodigoPostal> | <strPais>| <strComputer>      | <strVersion>      | <strLanguagePc>       | <strMobileDevice>        | <strModel>    | <strOS> | <strPassword>|
    Then a new user account must be created
    Examples:
      | strNombre | strApellido | strEmail | strMes|strDia | strAno|strCiudad | strCodigoPostal| strPais|strComputer|strVersion      | strLanguagePc       | strMobileDevice        | strModel    | strOS | strPassword |
      | Hermes     | diaz       | hermeci5645sadfsad6agdfgz12@hotmail.com | 5     | 28    | 1997  | Villavicencio | 500001| brazil|  Windows  | 7      | spanish       | Alcatel       | MD01    | Android 2.0 | HermesDiaz19970528        |

