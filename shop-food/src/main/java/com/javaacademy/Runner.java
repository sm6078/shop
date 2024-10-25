package com.javaacademy;

import static java.math.BigDecimal.valueOf;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        log.trace("Создаем еду: name: {}, price:{}, calories:{}", "Яблоко", valueOf(100), 50);
        Food apple = new Food("Яблоко", valueOf(100), 50);
        log.trace("Создаем еду: name: {}, price:{}, calories:{}", "Пицца", valueOf(500), 549);
        Food pizza = new Food("Пицца", valueOf(500), 549);
        CashRegister cashRegister = new CashRegister();
        cashRegister.addSoldProduct(apple);
        cashRegister.addSoldProduct(pizza);
        cashRegister.printSoldProducts();
    }
}