package com.mutahir.training;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {
	final Logger LOGGER = LogManager.getLogger();
    public Application() {
    	
    	LOGGER.debug("Inside Application");
 
        
    }
    
    //this is a just a test
    //nothing else
    public void doNothing() {
    	LOGGER.debug("test");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	
    	//TODO
	Application app = null;
	app = new Application();
	app.doNothing();
    }
}