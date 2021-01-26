package application;

import java.util.ArrayList;
import java.util.Arrays;

import model.Agenda;
import model.CustomRandom;
import model.Days;
import model.Group;
import model.Person;

//import org.springframework.beans.factory.annotation.Value;


public class Application {

	public static void main(String[] args) {
		
		//@Value("${app.random.seed}")
		Long seed = (long) 25;					// /!\ TODO /!\ utiliser @value avec springframework 
		
		CustomRandom customRandom = CustomRandom.getInstance();
		customRandom.setSeed(seed);
		
		Agenda agendaTheo = new Agenda();
		agendaTheo.setAgenda(new ArrayList<Days>(Arrays.asList(Days.Wednesday, Days.Thursday, Days.Friday)));
		Agenda agendaCarole = new Agenda();
		agendaCarole.setAgenda(new ArrayList<Days>(Arrays.asList(Days.Monday, Days.Tuesday, Days.Wednesday)));
		Person louis = new Person("Louis");
		Group laReleve = new Group("La relève", louis);
		
		laReleve.addMember(new Person("Olivier"));
		laReleve.addMember(new Person("Théo", agendaTheo));
		laReleve.addMember(new Person("Carole", agendaCarole));
		
		laReleve.printInfos();
	}
}
