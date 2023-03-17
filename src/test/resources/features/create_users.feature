@All
Feature: Crear usuario

  Como automatizador
  Quiero acceder a los servicios de la plataforma Swagger
  Para crear un usuario

  @CaseOne
  Scenario Outline: Validar la creacion de un usuario
    When creo un usuario
      | <id> | <username> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |
    Then  verifico la creacion del usuario con el estatus "200" y el mensaje "1"

    Examples:
      | id | username | firstName | lastName | email             | password | phone    | userStatus |
      | 1  | JJ       | Guzman41  | Medina41 | JJ41 @yopmail.com | 456789   | 12356891 | 0          |

  @CaseTwo
  Scenario Outline: Validar el pedido para una mascota
    When Creo un pedido
      | <id> | <petId> | <quantity> | <shipDate> | <status> | <complete> |
    Then verifico la creacion del usuario con el estatus "200"

    Examples:
      | id | petId | quantity | shipDate                     | status        | complete |
      | 2  | 2     | 10       | 2023-03-11T23:40:33.155+0000 | No Disponible | true     |