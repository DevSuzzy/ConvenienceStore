package org.example.service.implementation;

import org.example.entity.Cashier;
import org.example.entity.Store;
import org.example.service.ManagerService;

import java.util.ArrayList;
import java.util.List;

public class ManagerServiceImpl implements ManagerService {
    @Override
    public String canHire(Cashier cashier) {
        ArrayList<Cashier> cashierList = Store.getCashiers();
        if (!cashierList.contains(cashier)) {
            cashierList.add(cashier);
            return "Congratulations " + cashier.getName() + " you have been hired";
        } else {
            return "Cashier with name " + cashier.getName() + " has already been hired";
        }

    }

    public String canFire( Cashier cashier) {

        if (Store.getCashiers().contains(cashier)) {
            Store.getCashiers().remove(cashier);
            return "I'm Sorry " + cashier.getName() + " you have been fired ";
        } else {
            return "Cashier with name " + cashier.getName() + " You don't work here anymore";
        }
    }
}