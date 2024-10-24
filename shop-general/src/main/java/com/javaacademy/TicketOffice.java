package com.javaacademy;

import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

/**
 * класс Касса
 */
@NoArgsConstructor
public class TicketOffice {
    private final Set<Product> soldProducts = new HashSet<>();

    public void addSoldProduct (Product product) {
        soldProducts.add(product);
    }

    public void printSoldProducts() {
        System.out.println(soldProducts);
    }
}
