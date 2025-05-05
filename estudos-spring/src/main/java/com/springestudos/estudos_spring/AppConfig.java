package com.springestudos.estudos_spring;

import com.springestudos.estudos_spring.model.Order;
import com.springestudos.estudos_spring.service.OrderService;
import com.springestudos.estudos_spring.service.PaymentService;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// @Configuration para informar ao Spring que aqui há métodos que definem beans manualmente.
@Component
@Configuration
@ConfigurationProperties(prefix="app")
public class AppConfig {

    private String name;
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Define um bean manualmente
    // Pode ser injeado depois com autowired
    // Ideal para classes que nao tenho acesso como uma api de pagamento externa
    @Bean
    public PaymentService servicePayment() {
        return new PaymentService();
    }
}
