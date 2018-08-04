package com.lms.beans;

public class LabReleaseRequestBean {
	private String bookingId; 
	private String labId;
	private String labName;
	private String location;
	private String trainingName;
	private String loName;
	private String startDate;
	private String endDate;
	private String releaseDate;
	private String approval;
	
	public LabReleaseRequestBean(String bookingId,String labId,String labName,String location,String trainingName,String loName,String startDate,String endDate,String releaseDate,String approval)
	{
		this.bookingId = bookingId;
	    this.labId = labId;
	    this.labName = labName;
	    this.location = location;
	    this.trainingName = trainingName ;
	    this.loName = loName;
	    this.startDate = startDate;
	    this.endDate = endDate;
	    this.releaseDate = releaseDate;
	    this.approval = approval;
	
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
	public String getLabName() {
		return labName;
	}
	public void setLabName(String labName) {
		this.labName = labName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
	}
	

}
