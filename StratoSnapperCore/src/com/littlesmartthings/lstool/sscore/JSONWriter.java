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

/**
 *
 * @author Kevin Donovan
 */
public class JSONWriter {
    public void write(String file) {
 
	User user = new User();
	ObjectMapper mapper = new ObjectMapper();
 
	try {
 
		// convert user object to json string, and save to a file
		mapper.writeValue(new File(file), user);
 
		// display to console
		System.out.println(mapper.writeValueAsString(user));
 
	} catch (JsonGenerationException e) {
 
		e.printStackTrace();
 
	} catch (JsonMappingException e) {
 
		e.printStackTrace();
 
	} catch (IOException e) {
 
		e.printStackTrace();
 
	}
 
  }
}
