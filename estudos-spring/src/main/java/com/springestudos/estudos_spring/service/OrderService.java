package com.springestudos.estudos_spring.service;

import com.springestudos.estudos_spring.Cart;
import com.springestudos.estudos_spring.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Value("${app.name}")
    private String nameShop;

    @Value("${app.order.paymentStandard}")
    private String paymentStandard;

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

    public void infoStore() {
        System.out.println("Loja: " + nameShop);
        System.out.println("Método de pagamento padrão: " + paymentStandard);
    }
}
