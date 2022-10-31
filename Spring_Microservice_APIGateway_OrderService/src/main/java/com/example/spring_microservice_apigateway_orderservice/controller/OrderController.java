package com.example.spring_microservice_apigateway_orderservice.controller;

import com.example.spring_microservice_apigateway_orderservice.common.Payment;
import com.example.spring_microservice_apigateway_orderservice.common.TransactionRequest;
import com.example.spring_microservice_apigateway_orderservice.entity.Order;
import com.example.spring_microservice_apigateway_orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;
    
    @PostMapping("/bookOrder")
    public Order bookOrder(@RequestBody TransactionRequest request){
        Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());
        return service.saveOder(order);
    }
//    public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
//        return service.saveOrder(request);
//    }
}
