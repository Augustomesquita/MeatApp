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
public class Restaurant extends BaseEntity {

    private String name;
    private String category;
    private String deliveryEstimate;
    private Double rating;
    private String imagePath;
    private String about;
    private String hours;

    public Restaurant(String id, String name, String category, String deliveryEstimate, Double rating, String imagePath, String about, String hours) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.deliveryEstimate = deliveryEstimate;
        this.rating = rating;
        this.imagePath = imagePath;
        this.about = about;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDeliveryEstimate() {
        return deliveryEstimate;
    }

    public void setDeliveryEstimate(String deliveryEstimate) {
        this.deliveryEstimate = deliveryEstimate;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }
}
