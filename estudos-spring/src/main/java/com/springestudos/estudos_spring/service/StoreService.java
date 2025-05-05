package com.springestudos.estudos_spring.service;

import com.springestudos.estudos_spring.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {


    private final AppConfig appConfig;

    @Autowired
    public StoreService(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    public void display() {
        System.out.println("Loja: " + appConfig.getName());
        System.out.println("Pagamento: " +  appConfig.getOrder().getPaymentStandard());
    }
}
