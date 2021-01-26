package model;

import java.util.Random;

// Singleton class
public class CustomRandom {
	
	// Instance Singleton
    private static CustomRandom instance = null;
    
    
    // Attributes
    public Random random;
    
    
    // Constructor 
    private CustomRandom() {
    	random = new Random();
    }
    
    
    // Methods
    
    // static method to create instance of Singleton class
    public static CustomRandom getInstance() {
    	if (instance == null) instance = new CustomRandom();
    	return instance;
    }
 
    // set a seed
    public void setSeed(long seed) {
    	random.setSeed(seed);
    }
}
