package com.springestudos.estudos_spring;

import com.springestudos.estudos_spring.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EstudosSpringApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(EstudosSpringApplication.class, args);

		OrderService orderService1 = ctx.getBean(OrderService.class);
		orderService1.createOrder("Camisa", "PIX");

		OrderService orderService2 = ctx.getBean(OrderService.class);
		orderService2.createOrder("Moleton", "Cartão");

		//retorna true por os dois pedidos serem da mesma instancia do order service criado pelo spring no padrão singleton
		System.out.println("pedido1 == pedido2 ? " + (orderService1 == orderService2));

		//o carrinho é criado duas vezes por ser prototype

		orderService1.infoStore();

	}

}
