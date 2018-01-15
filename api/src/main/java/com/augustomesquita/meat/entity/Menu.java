/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.augustomesquita.meat.entity;

import com.augustomesquita.meat.entity.base.BaseEntity;

/**
 *
 * @author augusto
 */
public class Menu extends BaseEntity {

    private String imagePath;
    private String name;
    private String description;
    private Double price;
    private String restaurantId;

    public Menu(String id, String imagePath, String name, String description, Double price, String restaurantId) {
        this.id = id;
        this.imagePath = imagePath;
        this.name = name;
        this.description = description;
        this.price = price;
        this.restaurantId = restaurantId;
    }
    
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }
}
