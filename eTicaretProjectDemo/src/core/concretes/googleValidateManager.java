package core.concretes;
import eTicaretProjectDemo.entities.concretes.User;

public class googleValidateManager 
{
	public void register(User user) 
	{
		System.out.println("Kullan�c� kay�t yapt� : "+user.getFirstName()+" "+user.getLastName());
	}
	

	public void login(User user)
	{
		System.out.println("Kullan�c� giri� yapt� : "+user.getFirstName()+" "+user.getLastName());
	}
	
}
