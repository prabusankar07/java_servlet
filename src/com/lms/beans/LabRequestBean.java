package com.lms.beans;
import java.util.Date;
public class LabRequestBean {
	//private instance variables
	
	private String bookingId;
	private String labId;
	private String location;
	private String labName;
	private String trainingName;
	private String loName;
	private String startDate;
	private String endDate;
	private String approval;
	
	/*Explicit constructor for initialising 
	the private instance variables */
	public LabRequestBean(String bookingId,String labId,String location,String labName,String trainingName,String loName,String startDate,String endDate,String approval)
	{
	this.bookingId = bookingId;
    this.labId = labId ;
    this.location = location;
    this.labName = labName;
    this.trainingName = trainingName;
    this.loName = loName;
    this.startDate = startDate;
    this.endDate = endDate;
    this.approval = approval;
	}
	
	public LabRequestBean(String searchId) {
		// TODO Auto-generated constructor stub
		this.bookingId=searchId;
	}

	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getLabId() {
		return labId;
	}
	public void setLabId(String labId) {
		this.labId = labId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLabName() {
		return labName;
	}
	public void setLabName(String labName) {
		this.labName = labName;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public String getLoName() {
		return loName;
	}
	public void setLoName(String loName) {
		this.loName = loName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval= approval;
	}
	
	

}
