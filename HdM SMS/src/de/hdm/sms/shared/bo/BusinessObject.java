package de.hdm.sms.shared.bo;

import java.io.Serializable;

/**
 * Die Klasse BusinessObject dient als Superklasse für alle weiteren Business Objects innerhalb dieser Anwendung.
 * Wie aus dem zugehörigen Klassendiagramm ersichtlich ist, vererbt diese Klasse das Attribut ID und die zugehörigen
 * get- und set-Methoden.
 * 
 */
public class BusinessObject implements Serializable {
	
	 /** Diese ID wird benötigt, damit die Klasse serialisierbar ist */
 	private static final long serialVersionUID = 1L;
	 
	 /** Das BusinessObject erhält die ID in Form einer Integer-Variable */
 	private int id;
	 
	 /**
 	 * Die ID wird gesetzt, indem sie die ID aus der zugehörigen Datenbank zugewiesen bekommt.
 	 *
 	 * @param id the new id
 	 */
 	public void setId(int id) {
		 this.id = id;
	 }
 	
	 /**
	 * Mithilfe dieser Methode kann die ID wiederum ausgelesen werden.
	 *
	 * @return the id
	 */
	public int getId() {
		 return id;
	 }

}