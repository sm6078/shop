package com.javaacademy;

import lombok.*;

import java.math.BigDecimal;

/**
 * класс Еда
 */
//разобраться - доделать
public class Food extends Product {

    @NonNull
    private int amountCalories;

    public Food(@NonNull String name, @NonNull BigDecimal price, @NonNull int amountCalories) {
        super(name, price);
        this.amountCalories = amountCalories;
    }
}
