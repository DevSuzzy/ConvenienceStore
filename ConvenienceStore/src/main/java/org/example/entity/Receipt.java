package org.example.entity;

import java.time.LocalDateTime;

public class Receipt {
    private String customerFirstname;
    private String customerLastname;

    private String productName;
    private double amount;

    private String cashierName;

    private LocalDateTime dateOfPurchase;

    private int receiptId;


    public Receipt(Customer customer, Product product, int amount, Cashier cashier) {
        this.customerFirstname = customer.getFirstname();
        this.customerLastname = customer.getLastname();
        this.productName = product.getProductName();
        this.amount = product.getPrice() * amount;
        this.cashierName = cashier.getName();
        this.dateOfPurchase = LocalDateTime.now();
        this.receiptId = Store.getReceipts().size() + 1;
        Store.getReceipts().add(this);
    }

    public String getCustomerFirstname() {
        return customerFirstname;
    }

    public void setCustomerFirstname(String customerFirstname) {
        this.customerFirstname = customerFirstname;
    }

    public String getCustomerLastname() {
        return customerLastname;
    }

    public void setCustomerLastname(String customerLastname) {
        this.customerLastname = customerLastname;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public LocalDateTime getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public int getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "customerFirstname='" + customerFirstname + '\'' +
                ", customerLastname='" + customerLastname + '\'' +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                ", cashierName='" + cashierName + '\'' +
                ", dateOfPurchase=" + dateOfPurchase +
                ", receiptId=" + receiptId +
                '}';
    }
}
