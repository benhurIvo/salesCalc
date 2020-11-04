/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivo.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ivankayongo
 */
public class ItemTest {

    /**
     * Test of setItemName and getItemName method, of class Item.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        Item instance = new Item();
        instance.setItemName("benh");
        String expResult = "benh";
        String result = instance.getItemName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantity and getQuantity method, of class Item.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Item instance = new Item();
        instance.setQuantity(2);
        int expResult = 2;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCost and getCost method, of class Item.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Item instance = new Item();
        instance.setCost(2.0);
        double expResult = 2.0;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setCost method, of class Item.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        double cost = 1.0;
        Item instance = new Item();
        instance.setCost(cost);
        assertEquals(instance.cost,cost,0.0);
    }

    /**
     * Test of setSalesTax and getSalesTax method, of class Item.
     */
    @Test
    public void testGetSalesTax() {
        System.out.println("getSalesTax");
        Item instance = new Item();
        instance.setSalesTax(3.0);
        double expResult = 3.0;
        double result = instance.getSalesTax();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setSalesTax method, of class Item.
     */
    @Test
    public void testSetSalesTax() {
        System.out.println("setSalesTax");
        double salesTax = 3.0;
        Item instance = new Item();
        instance.setSalesTax(salesTax);
        assertEquals(instance.salesTax,salesTax,0.0);
    }
    
}
