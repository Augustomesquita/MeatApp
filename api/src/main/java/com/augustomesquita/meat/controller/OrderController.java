/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.augustomesquita.meat.controller;

import com.augustomesquita.meat.entity.Order;
import com.augustomesquita.meat.moc.MeatData;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author augusto
 */
@RestController

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/orders", produces = "application/json")
public class OrderController {

    @GetMapping
    public List<Order> getOrders() throws Exception {
        return MeatData.getInstance().getOrders();
    }
}
