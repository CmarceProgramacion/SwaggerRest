package com.swagger.utils.enums;

public enum RestServiceEnum {
    BASE_URL_USER("https://petstore.swagger.io/v2"),
    BASE_URL_ORDER("https://petstore.swagger.io/v2/store"),
    CREATE_USER("/user"),
    CREATE_ORDER("/order");

    private String service;

    RestServiceEnum(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return service;
    }
}
