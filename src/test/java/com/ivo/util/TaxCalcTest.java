/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivo.util;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ivankayongo
 */
public class TaxCalcTest {

    /**
     * Test of calcBasicTax method, of class TaxCalc.
     */
    @Test
    public void testCalcBasicTax() {
        System.out.println("calcBasicTax");
        double amount = 10.0;
        TaxCalc instance = new TaxCalc();
        double expResult = 1.0;
        double result = instance.calcBasicTax(amount);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcImportTax method, of class TaxCalc.
     */
    @Test
    public void testCalcImportTax() {
        System.out.println("calcImportTax");
        double amount = 10.0;
        TaxCalc instance = new TaxCalc();
        double expResult = 0.5;
        double result = instance.calcImportTax(amount);
        assertEquals(expResult, result, 0.0);
    }
    
}
