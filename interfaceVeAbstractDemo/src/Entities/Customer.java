package Entities;

public class Customer
{
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfYear;
	private String nationalityId;
	
	public Customer(int id, String firstName, String lastName, int dateOfYear, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfYear = dateOfYear;
		this.nationalityId = nationalityId;
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
	public int getDateOfYear() {
		return dateOfYear;
	}
	public void setDateOfYear(int dateOfYear) {
		this.dateOfYear = dateOfYear;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
}
