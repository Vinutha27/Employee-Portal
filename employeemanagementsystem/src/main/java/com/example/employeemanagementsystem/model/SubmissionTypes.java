package com.example.employeemanagementsystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection="submissiontypes")
public class SubmissionTypes {


	@Transient
    public static final String SEQUENCE_NAME = "submission_sequence";
	
	
	private int SubmissionID;
	private String SubmissionTypes;
	
	public SubmissionTypes() {

	}

	public SubmissionTypes(int submissionID, String submissionTypes) {
		super();
		this.SubmissionID = submissionID;
		this.SubmissionTypes = submissionTypes;
	}

	public int getSubmissionID() {
		return SubmissionID;
	}

	public void setSubmissionID(int submissionID) {
		this.SubmissionID = submissionID;
	}

	public String getSubmissionTypes() {
		return SubmissionTypes;
	}

	public void setSubmissionTypes(String submissionTypes) {
		this.SubmissionTypes = submissionTypes;
	}

	@Override
	public String toString() {
		return "SubmissionTypes [SubmissionID=" + SubmissionID + ", SubmissionTypes=" + SubmissionTypes + "]";
	}

	public void setId(Long generateSequence) {
		// TODO Auto-generated method stub
		
	}

	public void setSubmissionID(Long generateSequence) {
		// TODO Auto-generated method stub
		
	}

	
}