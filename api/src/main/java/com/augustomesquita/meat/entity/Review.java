/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.augustomesquita.meat.entity;

/**
 *
 * @author augusto
 */
public class Review {

    private String name;
    private String date;
    private Double rating;
    private String comments;
    private String restaurantId;

    public Review(String name, String date, Double rating, String comments, String restaurantId) {
        this.name = name;
        this.date = date;
        this.rating = rating;
        this.comments = comments;
        this.restaurantId = restaurantId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }
}
