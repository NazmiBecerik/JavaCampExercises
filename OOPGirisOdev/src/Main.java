
public class Main
{

	public static void main(String[] args) 
	{
		User user1 = new User(1,"Nazmi","507632xxxx",1999);
		UserManager userManager = new UserManager();
		userManager.Ekle(user1);
		userManager.Listele();
		
	}

}
