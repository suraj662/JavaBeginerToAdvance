package com.example.inventorymanagement.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class OrderResponse {

    private Long id;

    private String productName;

    private Integer orderedQuantity;

    private LocalDateTime orderDate;
}