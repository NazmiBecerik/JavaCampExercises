package Entities;

public class Campaign implements EntityService
{
	private int id ;
	private String name;
	private String date;
	private int discount ;
	
	public Campaign(int id, String name, String date, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}
