/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.littlesmartthings.lstool.sscore;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Kevin Donovan
 */
public class JSONReader {
        CameraList camList;
        
    public CameraList readCameraList() {

        ObjectMapper mapper = new ObjectMapper();

        try {
            final String filePath = "data/camera-list.json";
            InputStream stream = JSONReader.class.getResourceAsStream(filePath);
            
            // read from file, convert it to user class
            camList = mapper.readValue(stream, CameraList.class);
            //camList = mapper.readValue(new File(file), CameraList.class);
            // display to console
            System.out.println(camList);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return camList;
    }
}
