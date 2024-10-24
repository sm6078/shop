package com.javaacademy;

import static java.math.BigDecimal.valueOf;

public class Runner {
    public static void main(String[] args) {
        Food apple = new Food("Яблоко", valueOf(100), 50);
        Food pizza = new Food("Пицца", valueOf(500), 549);

        CashRegister cashRegister = new CashRegister();
        cashRegister.addSoldProduct(apple);
        cashRegister.addSoldProduct(pizza);

        cashRegister.printSoldProducts();
    }
}
