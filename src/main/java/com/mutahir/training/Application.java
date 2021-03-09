package com.mutahir.training;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {
    
    public Application() {
    	final Logger LOGGER = LogManager.getLogger();
        LOGGER.debug("Inside Application");
 
        
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	//System.out.println ("Starting Application");
	Application app = new Application();
    }
}