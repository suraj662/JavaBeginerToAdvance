package com.example.inventorymanagement.controller;

import com.example.inventorymanagement.dto.OrderResponse;
import com.example.inventorymanagement.dto.PlaceOrderRequest;
import com.example.inventorymanagement.entity.Order;
import com.example.inventorymanagement.repository.OrderRepository;
import com.example.inventorymanagement.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final OrderRepository orderRepository;

    @PostMapping
    public Order placeOrder(
            @RequestBody PlaceOrderRequest request) {

        return orderService.placeOrder(request);
    }

    
    @GetMapping
    public List<OrderResponse> getAllOrders() {

        return orderRepository.findAll()
                .stream()
                .map(order -> OrderResponse.builder()
                        .id(order.getId())
                        .productName(order.getProduct().getName())
                        .orderedQuantity(order.getOrderedQuantity())
                        .orderDate(order.getOrderDate())
                        .build())
                .toList();
    }
}
