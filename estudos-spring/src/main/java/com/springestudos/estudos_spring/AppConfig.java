package com.springestudos.estudos_spring;

import com.springestudos.estudos_spring.service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration para informar ao Spring que aqui há métodos que definem beans manualmente.
@Configuration
public class AppConfig {


    // Define um bean manualmente
    // Pode ser injeado depois com autowired
    // Ideal para classes que nao tenho acesso como uma api de pagamento externa
    @Bean
    public PaymentService servicePayment() {
        return new PaymentService();
    }
}
