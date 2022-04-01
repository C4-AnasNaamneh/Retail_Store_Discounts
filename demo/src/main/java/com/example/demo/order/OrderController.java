package com.example.demo.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/order")
public class OrderController {

    @GetMapping
    public List<Order> getOrders(){
        return List.of(
                new Order(
                        1L,
                        "anas",
                        30,
                        200,
                        130

                ),

                new Order(
                        2L,
                        "farhan",
                        10,
                        300,
                        255
                ),

                new Order(
                        3L,
                        "hamzeh",
                        10,
                        500,
                        425


                )

        );
    }


}
