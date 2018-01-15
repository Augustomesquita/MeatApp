/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.augustomesquita.meat.controller;

import com.augustomesquita.meat.entity.Menu;
import com.augustomesquita.meat.entity.Restaurant;
import com.augustomesquita.meat.entity.Review;
import com.augustomesquita.meat.moc.MeatData;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author augusto
 */
@RestController

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/restaurants", produces = "application/json")
public class RestaurantController {

    @GetMapping
    public List<Restaurant> getRestaurants() throws Exception {
        return MeatData.getInstance().getRestaurants();
    }

    @GetMapping(value = "{restaurantId}")
    public Restaurant getRestaurant(@PathVariable String restaurantId) throws Exception {
        return MeatData.getInstance().getRestaurantById(restaurantId);
    }

    @GetMapping(value = "{restaurantId}/menu")
    public List<Menu> getRestaurantMenu(@PathVariable String restaurantId) throws Exception {
        return MeatData.getInstance().getMenuByRestaurantId(restaurantId);
    }

    @GetMapping(value = "{restaurantId}/reviews")
    public List<Review> getRestaurantReviews(@PathVariable String restaurantId) throws Exception {
        return MeatData.getInstance().getReviewsByRestaurantId(restaurantId);
    }

}
