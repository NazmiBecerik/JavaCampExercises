package eTicaretProjectDemo.entities.concretes;

import eTicaretProjectDemo.entities.abstracts.EntityService;

public class User implements EntityService
{
	private int id ;
	private String firstName;
	private String lastName;
	private String eMail;
	private String parola;
	
	public User() 
	{
		
	}
	
	public User(int id, String firstName, String lastName, String eMail, String parola) 
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.parola = parola;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
}
