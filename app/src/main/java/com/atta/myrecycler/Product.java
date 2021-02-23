package com.atta.myrecycler;

import java.io.Serializable;

public class Product implements Serializable {

    private String name, imgUrl;
    private double price;

    public Product(String name, String imgUrl, double price) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public double getPrice() {
        return price;
    }
}
