/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.littlesmartthings.lstool.sscore;

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
public class JSONWriterTest {
    
    public JSONWriterTest() {
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
     * Test of write method, of class JSONWriter.
     */
    @Test
    public void testWrite() {
        System.out.println("write");
        String file = "c:\\user.json";
        new JSONWriter().write(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
