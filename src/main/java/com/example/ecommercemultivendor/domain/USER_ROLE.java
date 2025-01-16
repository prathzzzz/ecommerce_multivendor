package com.example.ecommercemultivendor.domain;

public enum USER_ROLE {
    ROLE_ADMIN,
    ROLE_CUSTOMER,
    ROLE_SELLER,
    ;

    public enum OrderStatus {
        PENDING,
        PLACED,
        CONFIRMED,
        SHIPPED,
        DELIVERED,
        CANCELLED,
    }
}
