package com.example.employeemanagementsystem.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemanagementsystem.model.SubmissionTypes;


@Repository
public interface SubmissionTypesRepository extends MongoRepository<SubmissionTypes, Integer>{

}
