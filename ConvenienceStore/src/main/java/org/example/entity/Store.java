package org.example.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {


    private static ArrayList<Product> products = new ArrayList<>();
    private static ArrayList<Receipt> receipts= new ArrayList<>();
    private static ArrayList<Cashier> cashiers = new ArrayList<>();


    public static ArrayList<Product> getProducts() {
        return products;
    }

    public static void setProducts(ArrayList<Product> products) {
        Store.products = products;
    }

    public static ArrayList<Receipt> getReceipts() {
        return receipts;
    }

    public static void setReceipts(ArrayList<Receipt> receipts) {
        Store.receipts = receipts;
    }

    public static ArrayList<Cashier> getCashiers() {
        return cashiers;
    }

    public static void setCashiers(ArrayList<Cashier> cashiers) {
        Store.cashiers = cashiers;
    }


}








    

