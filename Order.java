package com.zb.entity;

import java.io.Serializable;

public class Order implements Serializable {
    private Integer id;
    private String title;
    private Double price;
    private Integer uid;

    public Order() {
    }

    public Order(Integer id, String title, Double price, Integer uid) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.uid = uid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
