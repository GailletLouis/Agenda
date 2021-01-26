package com.louis.test.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.louis.test.model.Agenda;
import com.louis.test.model.CustomRandom;
import com.louis.test.model.Days;
import com.louis.test.model.Group;
import com.louis.test.model.Person;

@Service
public class AgendaService {
	
	public String printService() {
		//@Value("${app.random.seed}")
		Long seed = (long) 25;					// /!\ TODO /!\ utiliser @value avec springframework 
		
		CustomRandom customRandom = CustomRandom.getInstance();
		customRandom.setSeed(seed);
		
		Agenda agendaTheo = new Agenda();
		agendaTheo.setWeek(new ArrayList<Days>(Arrays.asList(Days.Wednesday, Days.Thursday, Days.Friday)));
		Agenda agendaCarole = new Agenda();
		agendaCarole.setWeek(new ArrayList<Days>(Arrays.asList(Days.Monday, Days.Tuesday, Days.Wednesday)));
		Person louis = new Person("Louis");
		Group laReleve = new Group("La rel�ve", louis);
		
		laReleve.addMember(new Person("Olivier"));
		laReleve.addMember(new Person("Th�o", agendaTheo));
		laReleve.addMember(new Person("Carole", agendaCarole));
		
		laReleve.printInfos();
		
		return "TODO : return strings";
	}
}
