package spring_estudies_jpa_h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import spring_estudies_jpa_h2.model.Order;
import spring_estudies_jpa_h2.model.OrderDTO;
import spring_estudies_jpa_h2.model.Store;
import spring_estudies_jpa_h2.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody OrderDTO orderDTO) {
        Order order1 = orderService.createOrder(orderDTO.getDesc(),orderDTO.getIdStore());
        return ResponseEntity.status(HttpStatus.CREATED).body(order1);
    }

    @GetMapping
    public List<Order> listAllOrders() {
        return orderService.listAll();
    }

}

