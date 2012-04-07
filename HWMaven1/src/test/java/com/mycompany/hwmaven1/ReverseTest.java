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
public class ReverseTest {
    
    public ReverseTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testReverseEvenWord() {
        System.out.println("reversing word with even number of letters");
        Reverse r = new Reverse();
        assertEquals("abcd", r.string("dcba"));
    }
        @Test
    public void testReverseOddWord() {
        System.out.println("reversing word with odd number of letters");
        Reverse r = new Reverse();
        assertEquals("wohskaerf", r.string("freakshow"));
    }

}
