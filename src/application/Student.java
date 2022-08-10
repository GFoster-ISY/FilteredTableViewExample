package application;

import javafx.beans.Observable;

public class Student {

	private String firstName;
	private String familyName;
	private Boolean AAHL;
	private Boolean CSHL;
	
	public Student(String fName, String sName, boolean AAHL, boolean CSHL) {
		setFirstName(fName);
		setFamilyName(sName);
		setAAHL(AAHL);
		setCSHL(CSHL);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Boolean getAAHL() {
		return AAHL;
	}

	public void setAAHL(Boolean aAHL) {
		AAHL = aAHL;
	}

	public Boolean getCSHL() {
		return CSHL;
	}

	public void setCSHL(Boolean cSHL) {
		CSHL = cSHL;
	}

	public boolean isEnrolled(String subject) {
		if (subject.equals("All")) return true;
		if (subject.equals("CS") && CSHL) return true;
		if (subject.equals("A&A") && AAHL) return true;
		return false;
	}

}
