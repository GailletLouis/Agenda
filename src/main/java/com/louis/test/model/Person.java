package com.louis.test.model;

public class Person {

	// Attributes
	private String name;
	private Agenda agenda;
	private String separator = " / ";
	
	// Constructors
	public Person(String name) {
		this.name = name;
		this.agenda = new Agenda();
		this.agenda.setWeek(Agenda.generateRandomWeek(5)); // Will fill agenda with random days
	}
	
	public Person(String name, Agenda agenda) {
		this.name = name;
		this.agenda = agenda;
	}
	
	// Methods
	public void printAgenda() {
		printName();
		System.out.print(" : ");
		agenda.print(separator);
		if(agenda.isEmpty()) System.out.print("En t�l�travail toute la semaine");
		System.out.println();
	}
	
	public void printName() {
		System.out.print(name);
	}
	
	// Getters & Setters
	public String getName() {
		return name;
	}
}
