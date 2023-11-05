package org.example.service.implementation;

import org.example.entity.Cashier;
import org.example.entity.Customer;
import org.example.entity.Product;
import org.example.entity.Receipt;
import org.example.service.CashierService;
import org.example.service.ManagerService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierServiceImpTest {

    private CashierService cashierService = new CashierServiceImp();

    @Test
    void testWhenProductIsNOtEnough() {
        Product tv = new Product("Samsung", 1000, 100);
        Cashier cashier1 = new Cashier("1", "Esther" ,123,35,"Sales");
        Customer customer1 = new Customer("Isaiah", "Val",1500 );

       Receipt response = cashierService.canSell(tv,customer1,cashier1,101);
        assertNull(response);

    }

    @Test
    void testWhenProductIsEnough() {
        Product tv = new Product("Samsung", 1000, 100);
        Cashier cashier1 = new Cashier("1", "Esther" ,123,35,"Sales");
        Customer customer1 = new Customer("Isaiah", "Val",1000 );
        double customerOldBalance = customer1.getBalance();
        double amountToPay = 1 * tv.getPrice();
        Receipt response = cashierService.canSell(tv,customer1,cashier1,1);




        assertEquals(response.getCustomerFirstname(),customer1.getFirstname());
        assertEquals(response.getProductName(),tv.getProductName());
        assertEquals(response.getAmount(),amountToPay);

        assertEquals(customer1.getBalance(),customerOldBalance -amountToPay);

    }
}