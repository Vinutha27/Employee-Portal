package com.example.employeemanagementsystem.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.employeemanagementsystem.Repository.EmployeeJourneyRepository;
import com.example.employeemanagementsystem.exception.ResourceNotFoundException;
import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.model.EmployeeJourney;
import com.example.employeemanagementsystem.service.SequenceGeneratorService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class EmployeeJourneyController {

	@Autowired
	private EmployeeJourneyRepository employeeJourneyRepository;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@GetMapping("/employeesjourney")
	public List<EmployeeJourney> getAllEmployeesjourney() {
		return employeeJourneyRepository.findAll();
	}

	@PostMapping("/Addemployeesjourney")
	public EmployeeJourney createEmployeeEmployeeJourney( @RequestBody EmployeeJourney employeeJourney) {
		employeeJourney.setId(sequenceGeneratorService.generateSequence(Employee.SEQUENCE_NAME));
		return employeeJourneyRepository.save(employeeJourney);
	
	}
}