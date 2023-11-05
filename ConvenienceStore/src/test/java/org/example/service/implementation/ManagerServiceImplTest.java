package org.example.service.implementation;

import org.example.entity.Cashier;
import org.example.entity.Store;
import org.example.service.ManagerService;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ManagerServiceImplTest {

    private ManagerService managerService = new ManagerServiceImpl();

    @org.junit.jupiter.api.Test
    void shouldReturnHiringSuccessMessage() {

        Cashier cashier1 = new Cashier("1", "Esther" ,123,35,"Sales");
        String message= managerService.canHire(cashier1);
        String expected = "Congratulations " + cashier1.getName() + " you have been hired";
        assertEquals(expected,message);


    }

    @org.junit.jupiter.api.Test
    void shouldReturnHiringFailureMessage() {

        Cashier cashier1 = new Cashier("1", "Esther" ,123,35,"Sales");
        managerService.canHire(cashier1);

        String message= managerService.canHire(cashier1);
        String expected =  "Cashier with name " + cashier1.getName() + " has already been hired";
        assertEquals(expected,message);


    }

    @org.junit.jupiter.api.Test
    void canFire() {
    }
}