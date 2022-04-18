package com.chisomanuforom.app.adapter;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private long studentId;
	private String serialNo;
	private String title;
	private String firstName;
	private String middleName;
	private String surname;
	private String firstLanguage;
	private String emailAddress;
	private String gender;
	private String phoneNumber;
	private String alternatePhoneNumber;
	private String dateOfBirth;
	private String religion;
	private int countryOfNationality;
	private String passportNo;
	private int countryOfIssue;
	private String nativeLanguage;
	private String passportUrl;
	private LocalDate dateRegistered;
	private LocalDate dateLastUpdated;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(long studentId, String serialNo, String title, String firstName, String middleName,
			String surname, String firstLanguage, String emailAddress, String gender, String phoneNumber,
			String alternatePhoneNumber, String dateOfBirth, String religion, int i,
			String passportNo, int j, String nativeLanguage, String passportUrl,
			LocalDate dateRegistered, LocalDate dateLastUpdated) {
		
		super();
		this.studentId = studentId;
		this.serialNo = serialNo;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.surname = surname;
		this.firstLanguage = firstLanguage;
		this.emailAddress = emailAddress;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.alternatePhoneNumber = alternatePhoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.religion = religion;
		this.countryOfNationality = i;
		this.passportNo = passportNo;
		this.countryOfIssue = j;
		this.nativeLanguage = nativeLanguage;
		this.passportUrl = passportUrl;
		this.dateRegistered = dateRegistered;
		this.dateLastUpdated = dateLastUpdated;
	}
	
	
	



	public Student( String serialNo, String title, String firstName, String middleName,
			String surname, String firstLanguage, String emailAddress, String gender, String phoneNumber,
			String alternatePhoneNumber, String dateOfBirth, String religion, int countryOfNationality,
			String passportNo, int countryOfIssue, String nativeLanguage, String passportUrl,
			LocalDate dateRegistered, LocalDate dateLastUpdated) {
		
		super();
		this.serialNo = serialNo;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.surname = surname;
		this.firstLanguage = firstLanguage;
		this.emailAddress = emailAddress;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.alternatePhoneNumber = alternatePhoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.religion = religion;
		this.countryOfNationality = countryOfNationality;
		this.passportNo = passportNo;
		this.countryOfIssue = countryOfIssue;
		this.nativeLanguage = nativeLanguage;
		this.passportUrl = passportUrl;
		this.dateRegistered = dateRegistered;
		this.dateLastUpdated = dateLastUpdated;
	}

	
	
	


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", serialNo=" + serialNo + ", title=" + title
				+ ", firstName=" + firstName + ", middleName=" + middleName + ", surname=" + surname
				+ ", firstLanguage=" + firstLanguage + ", emailAddress=" + emailAddress + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + ", alternatePhoneNumber=" + alternatePhoneNumber + ", dateOfBirth="
				+ dateOfBirth + ", religion=" + religion + ", countryOfNationality=" + countryOfNationality
				+ ", passportNo=" + passportNo + ", countryOfIssue=" + countryOfIssue + ", nativeLanguage="
				+ nativeLanguage + ", passportUrl=" + passportUrl + ", dateRegistered=" + dateRegistered
				+ ", dateLastUpdated=" + dateLastUpdated + "]";
	}


	public long getStudentId() {
		return studentId;
	}



	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}



	public String getSerialNo() {
		return serialNo;
	}



	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getMiddleName() {
		return middleName;
	}



	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getFirstLanguage() {
		return firstLanguage;
	}



	public void setFirstLanguage(String firstLanguage) {
		this.firstLanguage = firstLanguage;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getAlternatePhoneNumber() {
		return alternatePhoneNumber;
	}



	public void setAlternatePhoneNumber(String alternatePhoneNumber) {
		this.alternatePhoneNumber = alternatePhoneNumber;
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getReligion() {
		return religion;
	}



	public void setReligion(String religion) {
		this.religion = religion;
	}



	public int getCountryOfNationality() {
		return countryOfNationality;
	}



	public void setCountryOfNationality(int countryOfNationality) {
		this.countryOfNationality = countryOfNationality;
	}



	public String getPassportNo() {
		return passportNo;
	}



	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}



	public int getCountryOfIssue() {
		return countryOfIssue;
	}



	public void setCountryOfIssue(int countryOfIssue) {
		this.countryOfIssue = countryOfIssue;
	}



	public String getNativeLanguage() {
		return nativeLanguage;
	}



	public void setNativeLanguage(String nativeLanguage) {
		this.nativeLanguage = nativeLanguage;
	}



	public String getPassportUrl() {
		return passportUrl;
	}



	public void setPassportUrl(String passportUrl) {
		this.passportUrl = passportUrl;
	}



	public LocalDate getDateRegistered() {
		return dateRegistered;
	}



	public void setDateRegistered(LocalDate dateRegistered) {
		this.dateRegistered = dateRegistered;
	}



	public LocalDate getDateLastUpdated() {
		return dateLastUpdated;
	}



	public void setDateLastUpdated(LocalDate dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}
	

}
