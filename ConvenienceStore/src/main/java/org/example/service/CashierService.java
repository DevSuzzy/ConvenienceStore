package org.example.service;

import org.example.entity.Cashier;
import org.example.entity.Customer;
import org.example.entity.Product;
import org.example.entity.Receipt;

public interface CashierService {

    Receipt canSell(Product product, Customer customer, Cashier cashier, int amount);
}




