package org.example.entity;

import org.example.service.CashierService;
import org.example.service.implementation.CashierServiceImp;

import java.util.Scanner;
public class Cashier extends Staff {

    private double amountSold;
    private CashierService cashierService = new CashierServiceImp();
    public Cashier(String id, String name, int phoneNumber, int age, String department) {
        super(id, name, phoneNumber, age, department);
    }

    public Cashier() {
        super();
    }

    public void setAmountSold(double amountSold) {
        this.amountSold = amountSold;
    }
    public  Receipt sellProduct(Product product, Customer customer, int amount){
        return cashierService.canSell(product, customer,this, amount);
    }

    public double getAmountSold() {
        return amountSold;
    }
}





