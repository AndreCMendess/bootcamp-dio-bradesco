package spring_estudies_jpa_h2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_estudies_jpa_h2.model.Order;
import spring_estudies_jpa_h2.model.Store;
import spring_estudies_jpa_h2.repository.OrderRepository;
import spring_estudies_jpa_h2.repository.StoreRepository;

import java.util.List;


@Service
public class OrderService {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    OrderRepository orderRepository;


    public Order createOrder(String desc , Long storeId) {
        Store store = storeRepository.findById(storeId).orElseThrow(() ->
                new RuntimeException(" Loja não encontrada "));
        Order order = new Order();
        order.setDescription(desc);
        order.setStore(store);
        System.out.println("Pedido criado com sucesso ");
        orderRepository.save(order);
        return order;
    }

    public List<Order> listAll() {
        return orderRepository.findAll();
    }
}
