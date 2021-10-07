# Autor: Hermes Arnul Diaz Barreto
@stories
Feature: Academy Choucair
  As a user, Iwant to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario Outline: Search for a automate course
    Given than brandon wants to learn automation at the academy Choucair
    | strUser   | strPassword  |
    | <strUser> | <strPassword>     |
    When he searches for the course on the choucair academy platform
    | strCourse   |
    | <strCourse> |
    Then he finds the course called
    | strCourse    |
    | <strCourse>  |
    Examples:
      | strUser | strPassword | strCourse |
      | 1121945661| Diaz_12345| Foundation Level|
