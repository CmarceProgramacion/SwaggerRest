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

public class createUsersDefinitions {
    @Steps
    private CreateUserStep createUserStep;

    @Steps
    private CreateOrderStep createPedidoStep;

    @When("creo un usuario")
    public void creoUnUsuario(List<List<String>> dataUser) {
        UserModel user = new UserModel(dataUser.get(0));
        createUserStep.createUser(ConverterJson.converter(user));
    }

    @Then("verifico la creacion del usuario con el estatus {string} y el mensaje {string}")
    public void verificoLaCreacionDelUsuarioConElEstatusYElMensaje(String code, String message) {
        createUserStep.verifyStatus(code, message);
    }

    @When("Creo un pedido")
    public void creoUnPedido(List<List<String>> dataOrder) {
        OrderModel order = new OrderModel(dataOrder.get(0));
        createPedidoStep.createOrder(ConverterJson.converter(order));
    }

    @Then("verifico la creacion del usuario con el estatus {string}")
    public void verificoLaCreacionDelUsuarioConElEstatus(String code) {
        createPedidoStep.verifyOrder(code);

    }

}
