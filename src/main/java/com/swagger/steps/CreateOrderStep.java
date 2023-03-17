package com.swagger.steps;

import net.thucydides.core.annotations.Step;

import static com.swagger.utils.RestServiceEnum.BASE_URL_ORDER;
import static com.swagger.utils.RestServiceEnum.CREATE_ORDER;
import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CreateOrderStep {
    @Step
    public void createOrder(String order) {
        given().baseUri(BASE_URL_ORDER.toString())
                .header("Content-Type", "application/json")
                .body(order).when().post(CREATE_ORDER.toString());
    }

    @Step
    public void verifyOrder(String code) {
        int codeNumber = Integer.parseInt(code);
        assertThat(lastResponse().getStatusCode()).isEqualTo(codeNumber);
    }
}
