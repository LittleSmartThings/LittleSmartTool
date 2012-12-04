/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.littlesmartthings.lstool.connect;

/**
 *
 * @author Administrator
 */
interface Protocol {
        // protocol manager handles each received byte  
    void onReceive(byte b);  
      
    // protocol manager handles broken stream  
    void onStreamClosed();  
}
