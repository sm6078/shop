package com.javaacademy;

import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

/**
 * клас Товар
 */
@Data
                                                    //проверить подходит ли здесь @data
public class Product {
    @NonNull
    private String name;
    @NonNull
    private BigDecimal price;

}
