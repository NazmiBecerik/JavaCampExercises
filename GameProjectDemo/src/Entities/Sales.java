package Entities;

public class Sales implements EntityService
{
	private int id ;
	private String saleDate;
	
	public Sales(int id, String saleDate) {
		super();
		this.id = id;
		this.saleDate = saleDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}
	
}
