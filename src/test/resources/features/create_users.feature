@All
Feature: Create user and place order
  As an automator
  I want to access Swagger platform services
  To create a user and place an order

  @CaseOne
  Scenario Outline: Validate the creation of a user
    When create a user
      | <id> | <username> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |
    Then  verify user creation with status "200" and message "1"

    Examples:
      | id | username | firstName | lastName | email               | password | phone    | userStatus |
      | 9  | Milena9  | Guzman9   | Medina9  | Milena9@yopmail.com | 456789   | 12356891 | 0          |

  @CaseTwo
  Scenario Outline: Validate the order for a pet
    When I create an order
      | <id> | <petId> | <quantity> | <shipDate> | <status> | <complete> |
    Then verify the creation of the user with status "200"

    Examples:
      | id | petId | quantity | shipDate                     | status            | complete |
      | 3  | 3     | 10       | 2023-03-11T23:40:33.155+0000 | No Disponible --- | true     |