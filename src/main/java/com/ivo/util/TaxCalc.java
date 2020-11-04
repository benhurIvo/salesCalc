/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivo.util;

import com.ivo.model.Item;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ivankayongo
 */
public class TaxCalc {
    
    public double calcBasicTax(double amount){
        return 0.1*amount;
    }
    
    public double calcImportTax(double amount){
        return 0.05*amount;
    }
    
    public void calcReceipt() {
        System.out.println("Welcome to our Sales outlet. Please Enter Item details below");
        boolean cnt = true;
        DecimalFormat df = new DecimalFormat("0.00");
        List<Item> items = new ArrayList<>();
        double tx = 0;

        while (cnt) {

            Scanner myReader = new Scanner(System.in);
            boolean fromErr = false;
            Item item = new Item();

            try {
                if (!items.isEmpty()) {
                    System.out.print("More Items (Y/N) ?: ");
                    String more = myReader.next();
                    if (!more.toLowerCase().startsWith("y")) {
                        cnt = false;
                        break;
                    }
                }

                double taxCost = 0;

                System.out.print("Item Name: ");
                String itemName = myReader.next();
                item.setItemName(itemName);

                System.out.print("No of items: ");
                int quantity = myReader.nextInt();
                item.setQuantity(quantity);

                System.out.print("Cost of 1 item: ");
                double cost = myReader.nextDouble();

                System.out.print("Is it an import(Y/N)?: ");
                String isImprt = myReader.next();
                if (isImprt.toLowerCase().startsWith("y")) {
                    item.setSalesTax(item.getSalesTax()+(quantity * calcImportTax(cost)));
                    //taxCost = (quantity * cost) + (quantity * calcImportTax(cost));
                }
                    taxCost = (quantity * cost);
                

                System.out.print("Is it a BOOK or FOOD or MEDICAL item (Y/N)?");
                String typ = myReader.next();

                if (!typ.toLowerCase().startsWith("y")) {
                    //tx += (quantity * calcBasicTax(cost));
                    item.setSalesTax(item.getSalesTax()+ (quantity * calcBasicTax(cost)));
                }

                item.setCost(taxCost);

            } catch (InputMismatchException ex) {
                System.out.println("An Error has occured.");
                fromErr = true;
            }

            if (!fromErr) {
                items.add(item);
            }
        }
        System.out.println("Your Receipt:");
        double totTx = 0;
        double totalPaid = 0;
        for (Item item : items) {
            totTx = totTx + item.getSalesTax();
            totalPaid = totalPaid + (item.getCost() + item.getSalesTax());
            System.out.println(item.getQuantity() + " " + item.getItemName() + ": " + df.format(item.getCost() +item.getSalesTax()));
        }
        System.out.println("sales taxes: " + df.format(totTx));
        System.out.println("Total: " + df.format(totalPaid));
    }
}
