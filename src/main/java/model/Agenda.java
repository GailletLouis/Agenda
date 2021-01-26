package model;

import java.util.ArrayList;
import java.io.*;


// Java bean class
public class Agenda implements java.io.Serializable {
	
	// Attributes
	public ArrayList<Days> week;

	
	// Constructors	
	public Agenda() {
		this.week = new ArrayList<Days>();
	}


	// Methods 
	public static ArrayList<Days> generateRandomWeek(int len){
        CustomRandom customRandom = CustomRandom.getInstance();
		
        ArrayList<Days> week = new ArrayList<Days>();
        
        for(int i = 0; i < len; i++) {
           if (customRandom.random.nextBoolean())
           {
               week.add(Days.values()[i]);
           }
        }      
        return week;
    }
	
	// Default week printing with " " as a separator
	public void print() {
		print(" ");
	}
	
	public void print(String separator) {
        for (int index = 0; index < week.size(); index++) {
        	System.out.print(week.get(index));
        	if(index != week.size()-1)
        	{
        		System.out.print(separator);
        	}
        }
	}
	
	public boolean isEmpty() {
		if(week.isEmpty()) return true;
		else return false;
	}
}
