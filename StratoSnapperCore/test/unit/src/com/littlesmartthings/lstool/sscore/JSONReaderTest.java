/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.littlesmartthings.lstool.sscore;

import java.util.ArrayList;
import java.util.List;
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
public class JSONReaderTest {
    
    public JSONReaderTest() {
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
     * Test of main method, of class JSONReader.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        
        //CameraList list = new CameraList();
        CameraList list = new JSONReader().readCameraList();
        //CameraList list = new JSONReader().read("c:\\camera-list.json");
        assertNotNull(list);
        
//        for (Object object : list) {
//            object.toString();
//        }
    }
}
