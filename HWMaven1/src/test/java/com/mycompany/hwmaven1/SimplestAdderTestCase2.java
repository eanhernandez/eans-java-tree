/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hwmaven1;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author ean
 */
public class SimplestAdderTestCase2 {
    
    public SimplestAdderTestCase2() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addit method, of class SimplestAdder.
     */
    @Test
    public void testAddit() {
        System.out.println("addit fail case");
        int x = 5;
        int y = 10;
        SimplestAdder instance = new SimplestAdder();
        int expResult = 15;
        int result = instance.addit(x, y);
        assertEquals(expResult, result);
    }
}
