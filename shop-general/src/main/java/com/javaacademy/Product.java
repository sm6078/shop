package com.javaacademy;

import lombok.Data;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * клас Товар
 */
@Data
public class Product {
    @NonNull
    private String name;
    @NonNull
    private BigDecimal price;
}
