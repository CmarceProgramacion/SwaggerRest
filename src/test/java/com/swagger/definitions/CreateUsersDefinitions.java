package com.swagger.definitions;

import com.swagger.models.OrderModel;
import com.swagger.models.UserModel;
import com.swagger.steps.CreateOrderStep;
import com.swagger.steps.CreateUserStep;
import com.swagger.utils.enums.ConverterJson;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class CreateUsersDefinitions {
    @Steps
    private CreateUserStep createUserStep;
    @Steps
    private CreateOrderStep createOrderStep;

    @When("create a user")
    public void createAUser(List<List<String>> dataUser) {
        UserModel user = new UserModel(dataUser.get(0));
        createUserStep.createUser(ConverterJson.converter(user));
    }

    @Then("verify user creation with status {string} and message {string}")
    public void verifyUserCreationWithStatusAndMessage(String code, String message) {
        createUserStep.verifyStatus(code, message);
    }

    @When("I create an order")
    public void iCreateAnOrder(List<List<String>> dataOrder) {
        OrderModel order = new OrderModel(dataOrder.get(0));
        createOrderStep.createOrder(ConverterJson.converter(order));
    }

    @Then("verify the creation of the user with status {string}")
    public void verifyTheCreationOfTheUserWithStatus(String code) {
        createOrderStep.verifyOrder(code);
    }
}
