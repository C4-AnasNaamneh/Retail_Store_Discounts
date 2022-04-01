package com.example.demo.order;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

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
