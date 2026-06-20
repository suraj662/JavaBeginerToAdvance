package com.example.inventorymanagement.service;

import com.example.inventorymanagement.dto.PlaceOrderRequest;
import com.example.inventorymanagement.entity.Order;
import com.example.inventorymanagement.entity.Product;
import com.example.inventorymanagement.repository.OrderRepository;
import com.example.inventorymanagement.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    @Transactional
    public Order placeOrder(PlaceOrderRequest request) {

        Product product = productRepository.findById(request.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        if (product.getQuantity() < request.getQuantity()) {
            throw new RuntimeException("Insufficient stock");
        }

        product.setQuantity(
                product.getQuantity() - request.getQuantity()
        );

        productRepository.save(product);

        Order order = Order.builder()
                .product(product)
                .orderedQuantity(request.getQuantity())
                .orderDate(LocalDateTime.now())
                .build();

        return orderRepository.save(order);
    }
}
