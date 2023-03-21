@All
Feature: Create user and place order
  As an automator
  I want to access Swagger platform services
  To create a user and place an order

  @CaseOne
  Scenario Outline: Validate the creation of a user
    When create a user
      | <id> | <username> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |
    Then  verify user creation with status <status> and message <id>

    Examples:
      | id | username | firstName | lastName | email               | password | phone    | userStatus | status |
      | 10 | Milena20 | Guzman20  | Medina20 | Milena9@yopmail.com | 456789   | 12356891 | 0          | 200    |

  @CaseTwo
  Scenario Outline: Validate the order for a pet
    When I create an order
      | <id> | <petId> | <quantity> | <shipDate> | <status> | <complete> |
    Then verify the creation of the user with status "200"

    Examples:
      | id | petId | quantity | shipDate                     | status            | complete |
      | 3  | 3     | 10       | 2023-03-11T23:40:33.155+0000 | No Disponible --- | true     |