package com.javaacademy;

import java.util.ArrayList;
import java.util.List;
import lombok.NoArgsConstructor;

/**
 * класс Касса
 */
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