package com.javaacademy;

import static java.math.BigDecimal.valueOf;

public class RunnerTest {
    public static void main(String[] args) {
        Drug lorotadin = new Drug("Лоротадин", valueOf(250), true);
        CashRegister cashRegister = new CashRegister();
        cashRegister.addSoldProduct(lorotadin);
        cashRegister.printSoldProducts();
    }
}
