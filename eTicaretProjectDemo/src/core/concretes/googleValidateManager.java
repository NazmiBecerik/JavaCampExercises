package core.concretes;
import eTicaretProjectDemo.entities.concretes.User;

public class googleValidateManager 
{
	public void register(User user) 
	{
		System.out.println("Kullanýcý kayýt yaptý : "+user.getFirstName()+" "+user.getLastName());
	}
	

	public void login(User user)
	{
		System.out.println("Kullanýcý giriþ yaptý : "+user.getFirstName()+" "+user.getLastName());
	}
	
}
