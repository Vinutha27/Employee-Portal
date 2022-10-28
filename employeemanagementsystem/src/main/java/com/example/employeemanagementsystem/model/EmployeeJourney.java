package com.example.employeemanagementsystem.model;

import java.sql.Blob;
import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Document(collection="employeejourney")


public class EmployeeJourney {

	@Transient
    public static final String SEQUENCE_NAME = "user_sequence";
	
	private int id;
	@CreatedDate
	private LocalDate SubmissionDate;
	private String Summary;
    private String Description;
    @CreatedDate
    private LocalDate ApprovalDate;
	private String Status;
    private Blob AttachmentBlob;
    @CreatedDate
    private LocalDate ExpiryDate;
    
    public EmployeeJourney() {
    	
    }
    
	public EmployeeJourney(int id, LocalDate submissionDate, String summary, String description, LocalDate approvalDate,
			String status, Blob attachmentBlob, LocalDate expiryDate) {
		super();
		this.id = id;
		this.SubmissionDate = submissionDate;
		this.Summary = summary;
		this.Description = description;
		this.ApprovalDate = approvalDate;
		this.Status = status;
		this.AttachmentBlob = attachmentBlob;
		this.ExpiryDate = expiryDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getSubmissionDate() {
		return SubmissionDate;
	}
	public void setSubmissionDate(LocalDate submissionDate) {
		this.SubmissionDate = submissionDate;
	}
	public String getSummary() {
		return Summary;
	}
	public void setSummary(String summary) {
		this.Summary = summary;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public LocalDate getApprovalDate() {
		return ApprovalDate;
	}
	public void setApprovalDate(LocalDate approvalDate) {
		this.ApprovalDate = approvalDate;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		this.Status = status;
	}
	public Blob getAttachmentBlob() {
		return AttachmentBlob;
	}
	public void setAttachmentBlob(Blob attachmentBlob) {
		this.AttachmentBlob = attachmentBlob;
	}
	public LocalDate getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.ExpiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "EmployeeJourney [id=" + id + ", SubmissionDate=" + SubmissionDate + ", Summary=" + Summary
				+ ", Description=" + Description + ", ApprovalDate=" + ApprovalDate + ", Status=" + Status
				+ ", AttachmentBlob=" + AttachmentBlob + ", ExpiryDate=" + ExpiryDate + "]";
	}
	public void setId(Long generateSequence) {
		// TODO Auto-generated method stub
		
	}
    
    
}
