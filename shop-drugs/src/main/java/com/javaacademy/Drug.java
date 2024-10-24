package com.javaacademy;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * класс лекарство
 */
@Getter
@Setter
@ToString(callSuper = true)
public class Drug extends Product {
    @NonNull
    private Boolean isPrescription;

    public Drug(@NonNull String name, @NonNull BigDecimal price, @NonNull Boolean isPrescription) {
        super(name, price);
        this.isPrescription = isPrescription;
    }
}