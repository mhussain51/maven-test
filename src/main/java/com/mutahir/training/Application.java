package com.mutahir.training;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {
	final Logger logger = LogManager.getLogger();
    public Application() {
    	
    	logger.debug("Inside Application");
 
        
    }
    
    //this is a just a test
    //nothing else
    public void doNothing() {
    	logger.debug("test");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
	Application app = null;
	app = new Application();
	app.doNothing();
    }
}