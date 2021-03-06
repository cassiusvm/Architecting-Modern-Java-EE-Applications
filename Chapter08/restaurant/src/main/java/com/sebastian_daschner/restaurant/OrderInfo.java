package com.sebastian_daschner.restaurant;

import java.util.UUID;

public class OrderInfo {

    private final UUID orderId;

    public OrderInfo(UUID orderId) {
        this.orderId = orderId;
    }

    public UUID getOrderId() {
        return orderId;
    }
}
