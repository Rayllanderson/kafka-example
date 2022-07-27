package com.rayllanderson.kafka.producer.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@ToString
@AllArgsConstructor
public class Product {

    private final String id = UUID.randomUUID().toString();
    private String name;
    private BigDecimal value;
    private Integer quantity;
}
