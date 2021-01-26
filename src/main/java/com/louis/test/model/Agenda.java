package com.louis.test.model;

import java.util.ArrayList;
import java.io.*;


// Java bean class
public class Agenda implements java.io.Serializable {
	
	// Attributes
	private ArrayList<Days> week; // mettre days pour respecter les conventions de listes
	// lombok peut cr�er les getters et setters automatiquement lors de la compilation



	// Constructors	
	public Agenda() {
		this.week = new ArrayList<Days>();
	}
	
	// Je peux mettre des constructeurs avec des param�tres, mais il faut a minima un constructeur vide.
	// (si c'est un bean qui sera utilis� par des framework)


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
	
	// Getters & Setters
	
	public ArrayList<Days> getWeek() {
		return week;
	}


	public void setWeek(ArrayList<Days> week) {
		this.week = week;
	}
}
