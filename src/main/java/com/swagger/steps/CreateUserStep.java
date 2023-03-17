package com.swagger.steps;

import net.thucydides.core.annotations.Step;

import static com.swagger.utils.enums.RestServiceEnum.*;
import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CreateUserStep {

    @Step
    public void createUser(String user) {
        given().baseUri( BASE_URL_USER.toString()).
                header("Content-Type", "application/json").
                body(user).when().post(CREATE_USER.toString());
        System.out.println("-------> " + user);
    }

    @Step
    public void verifyStatus(String code, String message) {
        int codeNumber = Integer.parseInt(code);
        assertThat(lastResponse().getStatusCode()).isEqualTo(codeNumber);
        assertThat(lastResponse().getBody().asString()).contains(message);
    }
}