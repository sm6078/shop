package com.javaacademy;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * клаcc еда
 */
@Getter
@Setter
@ToString(callSuper = true)
public class Food extends Product {
    @NonNull
    private Integer amountCalories;

    public Food(@NonNull String name, @NonNull BigDecimal price, @NonNull Integer amountCalories) {
        super(name, price);
        this.amountCalories = amountCalories;
    }
}
