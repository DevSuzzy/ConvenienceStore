package org.example.entity;

import org.example.service.ManagerService;
import org.example.service.implementation.ManagerServiceImpl;

import java.util.Scanner;

public class Manager extends Staff {

    private ManagerService managerService = new ManagerServiceImpl();
    public Manager(String id, String name, int phoneNumber, int age, String department) {
        super(id, name, phoneNumber, age, department);
    }

    public Manager() {
    }


    public String hireCashier  (Cashier cashier){
       return managerService.canHire(cashier);
    }

    public String fireCashier  (Cashier cashier){
        return managerService.canFire(cashier);
    }
}
