/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.littlesmartthings.lstool.connect;

import com.littlesmartthings.lstool.connect.Connection;
import gnu.io.SerialPort;
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
public class ConnectionTest {
    SerialPort port;
    
    public ConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("setupClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("setUp");
    }
    
    @After
    public void tearDown() {
        System.out.println("tearDown");
        if (port != null) {
            port.close();
        }
    }

    /**
     * Test of connectToSerial method, of class Connection.
     */
    @Test
    public void testConnectToSerial() throws Exception {
        System.out.println("connectToSerial");
        String portName = "COM6";
        Connection instance = new Connection();
        instance.connectToSerial(portName);
        // port =  instance.connectToSerial(portName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertNotNull("Did connection fail", instance);
        //assertNotNull("Is port initialized", port);
        //port.close();
    }

    /**
     * Test of main method, of class Connection.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = {"COM6","#?!"};
        Connection.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
