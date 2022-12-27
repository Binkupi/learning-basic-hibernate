package com.demo.test.hibernate.models;

import javax.persistence.Column;

public class ModelGroupBy {

    private int id_customer;
    private String description;

    public ModelGroupBy() {
    }

    public ModelGroupBy(int id_customer, String description) {
        this.id_customer = id_customer;
        this.description = description;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
