/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.littlesmartthings.lstool.sscore;

//import com.littlesmartthings.lstool.ssapi.CameraData;
import java.util.ArrayList;
import java.util.List;

//import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Kevin Donovan
 */
//@ServiceProvider(service=CameraData.class)
public class CameraList { //implements CameraData {
    //List list;
    private static CameraBrand [] cameras;
    static CameraList cameraList;

    public static CameraList getInstance() {
        if (cameraList == null) {
            cameraList = new JSONReader().readCameraList();
        }
        return cameraList;
    }

//    private CameraList() {
//        
//    }
    
    
    
//    public CameraBrand[] getCameraList() {
//
//        if (cameras == null) {
//            new JSONReader().read("c:\\camera-list.json");
//        }
//        return cameras;
//    }
        
    public List getBrandList() {
        ArrayList<String> brandList = new ArrayList<String> (50);
        for (CameraBrand cameraBrand : cameras) {
            brandList.add(cameraBrand.getBrandName());            
        }
        return brandList;
    }

    public CameraBrand[] getCameras() {
        return cameras;
    }

    public void setCameras(CameraBrand[] cameras) {
        this.cameras = cameras;
    }

}
