/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.littlesmartthings.lstool.connect;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class ListPortsTest {
    
    public ListPortsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of list method, of class ListPorts.
     */
    @Test
    public void testList() {
        System.out.println("list");
        ListPorts instance = new ListPorts();
        Object[] result = instance.list();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ListPorts.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ListPorts.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
