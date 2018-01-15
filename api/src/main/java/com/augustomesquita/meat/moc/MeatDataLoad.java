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
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author augusto
 */
public class MeatDataLoad {

    public List<Restaurant> loadRestaurants() throws IOException, ParseException {
        List<Restaurant> restaurants = (List<Restaurant>) getList("restaurants", Restaurant[].class);
        return restaurants;
    }

    public List<Menu> loadMenus() throws IOException, ParseException {
        List<Menu> menus = (List<Menu>) getList("menu", Menu[].class);
        return menus;
    }

    public List<Review> loadReviews() throws IOException, ParseException {
        List<Review> reviews = (List<Review>) getList("reviews", Review[].class);
        return reviews;
    }

    public List<Order> loadOrders() throws IOException, ParseException {
        List<Order> orders = (List<Order>) getList("orders", Order[].class);
        return orders;
    }

    // Esse é um método genérico. Ele retorna uma lista de um determinado tipo
    // olhando o tipo de classe que está recebendo como argumento e atravéa 
    // da key recebida para procurados os dados no arquivo de JSON.
    private <T> List<T> getList(String keyOfArray, Class<T[]> clazz) throws IOException, ParseException, JsonSyntaxException {

        JSONObject dbJson = getJsonDB();
        Gson gson = new Gson();
        T[] listItem = null;

        Object itemsObjectList = dbJson.get(keyOfArray);
        if (itemsObjectList != null) {
            String itemsStringList = itemsObjectList.toString();
            listItem = gson.fromJson(itemsStringList, clazz);
        }

        return Arrays.asList(listItem);
    }

    // Retorna JSONObject do arquivo 'db.json'.  
    private JSONObject getJsonDB() throws ParseException, IOException {
        JSONParser parser = new JSONParser();
        InputStream resourceStream = this.getClass().getClassLoader().getResourceAsStream("db.json");
        String jsonAsString = IOUtils.toString(resourceStream);
        Object dbJsonFile = parser.parse(jsonAsString);
        JSONObject dbJson = (JSONObject) dbJsonFile;
        return dbJson;
    }

}
