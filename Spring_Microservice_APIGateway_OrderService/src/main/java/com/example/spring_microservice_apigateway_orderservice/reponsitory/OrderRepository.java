package com.example.spring_microservice_apigateway_orderservice.reponsitory;

import com.example.spring_microservice_apigateway_orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
