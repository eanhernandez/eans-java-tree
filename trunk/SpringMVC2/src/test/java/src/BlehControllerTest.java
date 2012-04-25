/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ean
 */
public class BlehControllerTest {
    
    public BlehControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of handleRequestInternal method, of class BlehController.
     */
    @Test
    public void testHandleRequestInternal() {
        System.out.println("handleRequestInternal");
        assertNotSame (0, 1);
        // TODO review the generated test code and remove the default call to fail.
    }
            @Test
        public void testAnotherThing()
        {
            assertEquals (0,0);
        
        }

}
