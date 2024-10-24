package com.javaacademy;

import static java.math.BigDecimal.valueOf;

public class Runner {
    public static void main(String[] args) {
        Drug paracetamol = new Drug("Парацетомол", valueOf(250), false);
        CashRegister cashRegister = new CashRegister();
        cashRegister.addSoldProduct(paracetamol);
        cashRegister.printSoldProducts();
    }
}
