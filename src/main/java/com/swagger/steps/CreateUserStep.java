package com.swagger.steps;

import net.thucydides.core.annotations.Step;

import static com.swagger.utils.RestServiceEnum.BASE_URL_USER;
import static com.swagger.utils.RestServiceEnum.CREATE_USER;
import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CreateUserStep {

    @Step
    public void createUser(String user) {
        given().baseUri(BASE_URL_USER.toString()).
                header("Content-Type", "application/json").
                body(user).when().post(CREATE_USER.toString());
    }

    @Step
    public void verifyStatus(int code, int message) {
        String messageNew = String.valueOf(message);

        assertThat(lastResponse().getStatusCode()).isEqualTo(code);
        assertThat(lastResponse().getBody().asString()).contains(messageNew);
    }
}