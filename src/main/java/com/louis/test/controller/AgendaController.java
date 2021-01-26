package com.louis.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.louis.test.service.AgendaService;

@RestController
public class AgendaController {
	
	@Autowired
	private AgendaService agendaService;
	
	@GetMapping(value = "print")
	public String printAgenda() {
		
		return agendaService.printService();
	}
}
