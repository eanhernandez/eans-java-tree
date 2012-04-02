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
public class SimplestAdderTestCase {
    
    public SimplestAdderTestCase() {
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
        System.out.println("addit");
        int x = 3;
        int y = 5;
        SimplestAdder instance = new SimplestAdder();
        int expResult = 8;
        int result = instance.addit(x, y);
        assertEquals(expResult, result);
    }
}
