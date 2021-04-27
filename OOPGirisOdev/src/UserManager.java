import java.util.*;
public class UserManager
{
	List<User> _kullanicilar;
	public UserManager() 
	{
		_kullanicilar=new ArrayList<User>(); 
	}
	public void Ekle(User user) 
	{
		_kullanicilar.add(user);
	}
	public void Listele()
	{
		for (int i = 0;i<_kullanicilar.size();i++) 
		{
			System.out.println(_kullanicilar.get(i).name);
		}
	}
}
