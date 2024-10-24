package com.javaacademy;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * класс Касса
 */
@NoArgsConstructor
public class CashRegister {
    private final List<Product> soldProducts = new ArrayList<>() {
    };

    public void addSoldProduct(Product product) {
        soldProducts.add(product);
    }

    public void printSoldProducts() {
        System.out.println(soldProducts);
    }
}
