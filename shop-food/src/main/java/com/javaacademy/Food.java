package com.javaacademy;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

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