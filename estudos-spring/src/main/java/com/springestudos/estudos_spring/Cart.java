package com.springestudos.estudos_spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cart {

    public Cart() {
        System.out.println("Novo carrinho criado!");
    }

    public void addItem(String item) {
        System.out.println("Item adicionado ao carrinho " + item);
    }
}
