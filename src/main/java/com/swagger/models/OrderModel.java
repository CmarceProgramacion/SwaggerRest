package com.swagger.models;

import java.util.List;

public class OrderModel {

    private Integer id;
    private Integer petId;
    private Integer quantity;
    private String shipDate;
    private String status;
    private  Boolean complete;


    public OrderModel(List<String> dataOrder) {
        this.id = Integer.valueOf(dataOrder.get(0));
        this.petId = Integer.valueOf(dataOrder.get(1));
        this.quantity = Integer.valueOf(dataOrder.get(2));
        this.shipDate = dataOrder.get(3);
        this.status = dataOrder.get(4);
        this.complete = Boolean.valueOf(dataOrder.get(5));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }
}
