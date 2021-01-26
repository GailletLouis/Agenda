package com.louis.test.model;

import java.util.ArrayList;

public class Group {

	// Attributes
	private ArrayList<Person> listMembers = new ArrayList<Person>();
	private String name;
	private Person groupOwner;
	
	// Constructors 
	public Group(String name, Person owner) {
		this.name = name;
		this.groupOwner = owner;
		this.listMembers.add(owner);
	}
	
	public Group(String name, Person owner, ArrayList<Person> listMembers) {
		this.name = name;
		this.groupOwner = owner;
		this.listMembers.add(owner);
		for (Person member: listMembers) {
			this.listMembers.add(member);
		}
	}
	
	// Methods
	public void addMember(Person person) {
		listMembers.add(person);
	}
	
	public void printInfos() {
		System.out.println("Group name : " + this.name);
		System.out.println("Group owner : " + this.groupOwner.getName());
		for(Person member : listMembers) {
			member.printAgenda();
		}
	}
}
