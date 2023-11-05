package org.example;

import org.example.entity.*;
import org.example.service.implementation.CashierServiceImp;
import org.example.service.implementation.ManagerServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // make all required objects

        Manager generalManager = new Manager("1", "John" ,123,35,"Sales");
        Product tv = new Product("Samsung", 1000, 100);
        Product phone = new Product("Infinix", 10, 100);
        Cashier cashier1 = new Cashier("1", "Esther" ,123,35,"Sales");
        Cashier cashier2 = new Cashier("1", "Peter" ,123,35,"Sales");
        Customer customer1 = new Customer("Isaiah", "Val",1500 );
        Customer customer2 = new Customer("Moses", "Exodus",100000 );

        // test manager
        System.out.println( generalManager.hireCashier(cashier1));
//        System.out.println(generalManager.hireCashier(cashier2));
//        System.out.println(Store.getCashiers().size());
//        generalManager.fireCashier(cashier2);
//        System.out.println(Store.getCashiers().size());
        int quantityToPurchase = 1;

//        System.out.println(customer1.getBalance());
//        System.out.println(tv.getPrice());
//        System.out.println(customer1.getBalance()*quantityToPurchase);
//        Receipt receipt = cashier1.sellProduct(tv,customer1,quantityToPurchase);

//        System.out.println(customer1.getBalance());
//        System.out.println(cashier1.getAmountSold());
        System.out.println(tv.getQuantity());
//        System.out.println(receipt);

        Receipt receipt2 = cashier1.sellProduct(tv,customer2,100);

        System.out.println(customer2.getBalance());
        System.out.println(cashier1.getAmountSold());
        System.out.println(receipt2);




    }

}




