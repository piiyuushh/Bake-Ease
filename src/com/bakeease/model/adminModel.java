/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bakeease.model;

/**
 *
 * @author piyushkarn
 */
public class adminModel {
    // declaring variables
    private String productName;
    private int quantity;
    private int price;
    private int productId;

    // declaring public getter method for product Id
    public int getProductId() {
        return productId;
    }

    // constructor for the current class with parameters
    public adminModel(int productId, String productName, int quantity, int price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.productId = productId;
    }

    // getter methods
    // getter method for product name
    public String getProductName() {
        return productName;
    }

    // getter method for product quantity
    public int getQuantity() {
        return quantity;
    }

    // getter method for product price
    public int getPrice() {
        return price;
    }
    
    
    // setter method for product name
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // setter method for product quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // setter method for product price
    public void setPrice(int price) {
        this.price = price;
    }

    // setter method for product name
    public void setProductId(int productId) {
        this.productId = productId;
    }
}
