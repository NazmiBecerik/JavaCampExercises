
public class User 
{
	int id ;
	String name ;
	String phoneNumber;
	int birthYear;
	
	public User(int id,String name, String phoneNumber,int birthYear) 
	{
		this.id = id;
		this.name =name;
		this.birthYear=birthYear;
		this.phoneNumber=phoneNumber;
	}
	public User() 
	{
		System.out.println(" Constructor ama parametresiz :) ");
	}
}
