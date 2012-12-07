/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.littlesmartthings.lstool.ssapi;

import java.util.List;
import com.littlesmartthings.lstool.sscore.CameraList;

/**
 *
 * @author Administrator
 */
public class CameraData {
    CameraList camList;
    
    public CameraList getData() {
        return CameraList.getInstance(); 
    }
    
    public List getBrandList() {
        return CameraList.getInstance().getBrandList();
    }
    
}
