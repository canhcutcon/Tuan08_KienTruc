package com.example.spring_microservice_apigateway_orderservice.service;

import com.example.spring_microservice_apigateway_orderservice.entity.Order;
import com.example.spring_microservice_apigateway_orderservice.reponsitory.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    Logger logger= LoggerFactory.getLogger(OrderService.class);
    @Autowired
    private OrderRepository repository;

    public Order saveOder(Order order)
    {
        return repository.save(order);
    }
//    public TransactionResponse saveOrder(TransactionRequest request) throws JsonProcessingException {
//        String response = "";
//        Order order = request.getOrder();
//        Payment payment = request.getPayment();
//        payment.setOrderId(order.getId());
//        payment.setAmount(order.getPrice());
//        //rest call
//        logger.info("Order-Service Request : "+new ObjectMapper().writeValueAsString(request));
//        Payment paymentResponse = template.postForObject(ENDPOINT_URL, payment, Payment.class);
//
//        response = paymentResponse.getPaymentStatus().equals("success") ? "payment processing successful and order placed" : "there is a failure in payment api , order added to cart";
//        logger.info("Order Service getting Response from Payment-Service : "+new ObjectMapper().writeValueAsString(response));
//        repository.save(order);
//        return new TransactionResponse(order, paymentResponse.getAmount(), paymentResponse.getTransactionId(), response);
//    }
}
