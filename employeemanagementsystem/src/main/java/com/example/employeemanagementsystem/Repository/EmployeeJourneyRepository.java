package com.example.employeemanagementsystem.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.employeemanagementsystem.model.EmployeeJourney;

public interface EmployeeJourneyRepository extends MongoRepository<EmployeeJourney, Integer>{

	Optional<EmployeeJourney> findById(Long employeeId);

}
