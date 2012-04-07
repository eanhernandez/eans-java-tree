/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hwmaven1;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author ean
 */
public class SimplestAdderTest {
    
    public SimplestAdderTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @Test
    public void testAddit() {
        System.out.println("adding some numbers");
        SimplestAdder instance = new SimplestAdder();
        assertEquals(9, instance.addit(4, 5));
        assertEquals(6, instance.addit(1, 5));
        assertEquals(10, instance.addit(2, 8));
        assertEquals(0, instance.addit(0, 0));
    }
    @Test
    public void testAddit2(){
        System.out.println("checking zero = zero");
        assertEquals(0,0);
    }
    @Test
    public void testAdditNegatives()
    {
        System.out.println("adding some negative numbers");
        SimplestAdder instance = new SimplestAdder();       
        assertEquals(-2,instance.addit(-1, -1));
    }
}












