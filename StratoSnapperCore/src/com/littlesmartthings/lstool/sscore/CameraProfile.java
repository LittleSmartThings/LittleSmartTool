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
public class CameraProfile {
    private String models;
    private CameraFunction [] functions;
    
    public List getFunctionList() {
        ArrayList<String> functionList = new ArrayList<String>(10);
        for (CameraFunction cameraFunction : functions) {
            functionList.add(cameraFunction.getId());
        }
        return functionList;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public CameraFunction[] getFunctions() {
        return functions;
    }

    public void setFunctions(CameraFunction[] functions) {
        this.functions = functions;
    }
//
//    private static class CameraFunction {
//        private String id;
//        
//        public CameraFunction() {
//        }
//
//        public String getId() {
//            return id;
//        }
//
//        public void setId(String id) {
//            this.id = id;
//        }
//    }

}
