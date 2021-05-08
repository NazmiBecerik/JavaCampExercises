package Entities;

public class Gamer implements EntityService
{
	private int id ;
	private String firtsName;
	private String lastName;
	private String nationalityNumber;
	private String birthDay;
	
	public Gamer(int id, String firtsName, String lastName, String nationalityNumber, String birthDay) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.nationalityNumber = nationalityNumber;
		this.birthDay = birthDay;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityNumber() {
		return nationalityNumber;
	}
	public void setNationalityNumber(String nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
}
