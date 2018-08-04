package com.lms.beans;

public class LabDetailsBean {
	private String labId;
	private String labName;
	private String type;
	private String country;
	private String city;
	private String capacity;
	private String status;
	private String projector;
	private String phone;
	private String mike;
	private String soundSystem;
	private String videoConference;
	private String airConditioner;
	private String whiteBoard;
	private String systemsAvailable;
	
	
	
	public LabDetailsBean(String labID, String labName, String type,
			String capacity, String country, String city, String status,
			String systemsAvailable, String whiteBoard, String airConditioner, String projector,
			String phone, String mike, String soundSystem, String videoConference) {
		// TODO Auto-generated constructor stub
		this.labName=labName;
		this.labId=labID;
		this.type=type;
		this.capacity=capacity;
		this.country=country;
		this.city=city;
		this.status=status;
		this.systemsAvailable=systemsAvailable;
		this.whiteBoard=whiteBoard;
		this.airConditioner=airConditioner;
		this.projector=projector;
		this.phone=phone;
		this.mike=mike;
		this.soundSystem=soundSystem;
		this.videoConference=videoConference;
		}
	public LabDetailsBean(String id) {
		// TODO Auto-generated constructor stub
		this.labId=id;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public void setAirConditioner(String airConditioner) {
		this.airConditioner = airConditioner;
	}
	public String getWhiteBoard() {
		return whiteBoard;
	}
	public void setWhiteBoard(String whiteBoard) {
		this.whiteBoard = whiteBoard;
	}
	public String getSystemsAvailable() {
		return systemsAvailable;
	}
	public void setSystemsAvailable(String systemsAvailable) {
		this.systemsAvailable = systemsAvailable;
	}
	public String getLabName() {
		return labName;
	}
	public void setLabName(String labName) {
		this.labName = labName;
	}
	public String getLabId() {
		return labId;
	}
	public void setLabId(String labId) {
		this.labId = labId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProjector() {
		return projector;
	}
	public void setProjector(String projector) {
		this.projector = projector;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMike() {
		return mike;
	}
	public void setMike(String mike) {
		this.mike = mike;
	}
	public String getSoundSystem() {
		return soundSystem;
	}
	public void setSoundSystem(String soundSystem) {
		this.soundSystem = soundSystem;
	}
	public String getVideoConference() {
		return videoConference;
	}
	public void setVideoConference(String videoConference) {
		this.videoConference = videoConference;
	}



}
