/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.littlesmartthings.lstool.sscore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Donovan
 */
class CameraBrand {

    private String brandName;
    private CameraProfile[] profiles;

    public List getModelList() {
        ArrayList<String> modelList = new ArrayList<String>(30);
        for (CameraProfile cameraProfile : profiles) {
            modelList.add(cameraProfile.getModels());
        }
        return modelList;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public CameraProfile[] getProfiles() {
        return profiles;
    }

    public void setProfiles(CameraProfile[] profiles) {
        this.profiles = profiles;
    }

    public String toString() {
        return getBrandName();
    }
}
