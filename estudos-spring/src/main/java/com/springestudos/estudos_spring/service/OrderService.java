package com.springestudos.estudos_spring.service;

import com.springestudos.estudos_spring.Cart;
import com.springestudos.estudos_spring.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private Logger logger;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private Cart cart;

    public void createOrder(String item, String methodPayment) {
        logger.log("Iniciando novo pedido");
        cart.addItem(item);
        paymentService.pay(methodPayment);
        logger.log("Pedido finalizado.");
    }
}
