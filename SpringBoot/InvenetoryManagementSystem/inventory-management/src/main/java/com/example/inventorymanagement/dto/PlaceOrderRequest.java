package com.example.inventorymanagement.dto;

import lombok.Data;

@Data
public class PlaceOrderRequest {

    private Long productId;

    private Integer quantity;
}