package com.javaacademy;

import static java.math.BigDecimal.valueOf;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RunnerTest {
    public static void main(String[] args) {
        log.trace("Создаем лекарство: name: {}, price:{}, isPrescription:{}",
                "Лоротадин", valueOf(250), true);
        Drug lorotadin = new Drug("Лоротадин", valueOf(250), true);
        CashRegister cashRegister = new CashRegister();
        cashRegister.addSoldProduct(lorotadin);
        cashRegister.printSoldProducts();
    }
}
