package com.javaacademy;

import static java.math.BigDecimal.valueOf;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        log.trace("Создаем лекарство: name: {}, price:{}, isPrescription:{}",
                "Парацетомол", valueOf(250), false);
        Drug paracetamol = new Drug("Парацетомол", valueOf(250), false);
        CashRegister cashRegister = new CashRegister();
        cashRegister.addSoldProduct(paracetamol);
        cashRegister.printSoldProducts();
    }
}