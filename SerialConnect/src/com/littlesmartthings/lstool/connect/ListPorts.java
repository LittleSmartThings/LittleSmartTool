/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.littlesmartthings.lstool.connect;

import com.littlesmartthings.lstool.ssapi.PortLister;
import gnu.io.CommPortIdentifier;  
import java.util.ArrayList;
   
import java.util.Enumeration;  
import org.openide.util.lookup.ServiceProvider;
   
@ServiceProvider(service = PortLister.class)
public class ListPorts implements PortLister{  
   
    public Object [] list() {  
        Enumeration ports = CommPortIdentifier.getPortIdentifiers();
        ArrayList portNames = new ArrayList();
          
        while(ports.hasMoreElements()) {
            String portName = ((CommPortIdentifier)ports.nextElement()).getName();
            //System.out.println(portName);
            portNames.add(portName);
        }       
        
        //String[] portList = (String[]) portNames.toArray();
        
        return portNames.toArray();
        
    }  
   
    public static void main(String[] args) {  
        new ListPorts().list();
    }  
}  
