package de.hdm.sms.shared.bo;

public class User extends BusinessObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String FirstName;
	private String LastName;
	private String eMailAdress;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String geteMailAdress() {
		return eMailAdress;
	}
	public void seteMailAdress(String eMailAdress) {
		this.eMailAdress = eMailAdress;
	}

}
