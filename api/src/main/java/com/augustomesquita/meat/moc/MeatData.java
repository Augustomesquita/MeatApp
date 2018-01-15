/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.augustomesquita.meat.moc;

import com.augustomesquita.meat.entity.Menu;
import com.augustomesquita.meat.entity.Order;
import com.augustomesquita.meat.entity.Restaurant;
import com.augustomesquita.meat.entity.Review;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.json.simple.parser.ParseException;

/**
 *
 * @author augusto
 */
public class MeatData {

    private static MeatData meatData;
    private final List<Restaurant> restaurants;
    private final List<Menu> menus;
    private final List<Review> reviews;
    private final List<Order> orders;

    public MeatData() throws IOException, ParseException {
        MeatDataLoad meattLoad = new MeatDataLoad();
        restaurants = meattLoad.loadRestaurants();
        menus = meattLoad.loadMenus();
        reviews = meattLoad.loadReviews();
        orders = meattLoad.loadOrders();
    }

    public static synchronized MeatData getInstance() throws IOException, ParseException {
        if (meatData == null) {
            meatData = new MeatData();
        }
        return meatData;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public Restaurant getRestaurantById(String restaurantId) {
        return restaurants.stream().filter(restaurant -> restaurant.getId().equals(restaurantId)).findAny().orElse(null);
    }

    public List<Menu> getMenuByRestaurantId(String restaurantId) {
        return menus.stream()
                .filter(menu -> menu.getRestaurantId().equals(restaurantId))
                .collect(Collectors.toList());
    }

    public List<Review> getReviewsByRestaurantId(String restaurantId) {
        return reviews.stream()
                .filter(review -> review.getRestaurantId().equals(restaurantId))
                .collect(Collectors.toList());
    }

    public List<Order> getOrders() {
        return orders;
    }

}
