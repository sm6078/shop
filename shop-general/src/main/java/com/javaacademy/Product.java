package com.javaacademy;

import java.math.BigDecimal;
import lombok.Data;
import lombok.NonNull;

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