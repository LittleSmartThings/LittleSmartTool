/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.littlesmartthings.lstool.sscore;

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
public class CameraListTest {
    
    public CameraListTest() {
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
     * Test of getCameraList method, of class CameraList.
     */
    @Test
    public void testGetCameraList() {
//        System.out.println("getCameraList");
//        CameraList instance = new CameraList();
//        CameraList expResult = new JSONReader().read("c:\\camera-list.json");
//        CameraList result = instance.getCameraList();
//        //System.out.println("CameraList size: "+result.size());
//        assertEquals(expResult, result);

    }

    /**
     * Test of getBrandList method, of class CameraList.
     */
    @Test
    public void testGetBrandList() {
        System.out.println("getBrandList");
        CameraList instance = new CameraList();
        List expResult = null;
        List result = instance.getBrandList();
        //assertEquals(expResult, result);
        System.out.println("BrandList size: "+result.size());
        
        assertNotNull(result);
    }

    /**
     * Test of getCameras method, of class CameraList.
     */
    @Test
    public void testGetCameras() {
        System.out.println("getCameras");
        CameraList instance = new CameraList();
        CameraBrand[] expResult = null;
        CameraBrand[] result = instance.getCameras();
        //assertArrayEquals(expResult, result);
        System.out.println("Camera Array size: "+result.length);
        
        assertNotNull(result);
    }

    /**
     * Test of setCameras method, of class CameraList.
     */
    @Test
    public void testSetCameras() {
        System.out.println("setCameras");
        CameraBrand[] cameras = null;
        CameraList instance = new CameraList();
        instance.setCameras(cameras);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of getInstance method, of class CameraList.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        CameraList expResult = null;
        CameraList result = CameraList.getInstance();
        assertNotSame(expResult, result);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
