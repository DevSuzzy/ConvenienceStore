package org.example.service.implementation;
import org.example.entity.Cashier;
import org.example.entity.Customer;
import org.example.entity.Product;
import org.example.entity.Receipt;
import org.example.service.CashierService;

public class CashierServiceImp implements CashierService {

    @Override
    public Receipt canSell(Product product, Customer customer, Cashier cashier, int amount) {

        double totalAmount = product.getPrice()*amount;

        if (product.getQuantity() < amount) {
            System.out.println("Not enough goods");
            return null;
        }
        // check balance and deduct money and deduct product and add money to cashier balance
       if (customer.getBalance() >= totalAmount) {

            customer.setBalance(customer.getBalance() - totalAmount);
            product.setQuantity(product.getQuantity() - amount);
            cashier.setAmountSold(totalAmount);
            return makeReceipt(product,amount,customer,cashier);
        }

        else {
            System.out.println("Not enough balance");
            return null;
        }
    }




    private Receipt makeReceipt (Product product, int amount, Customer customer, Cashier cashier){
        return new Receipt(customer,product,amount,cashier);
    }
}





