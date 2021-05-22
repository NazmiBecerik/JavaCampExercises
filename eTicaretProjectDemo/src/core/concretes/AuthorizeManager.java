package core.concretes;

import core.abstracts.AuthorizeService;
import eTicaretProjectDemo.entities.concretes.User;

public class AuthorizeManager implements AuthorizeService
{

	@Override
	public void register(User user) 
	{
		googleValidateManager googleManager = new googleValidateManager();
		googleManager.register(user);
		
	}

	@Override
	public void login(User user) 
	{
		googleValidateManager googleManager = new googleValidateManager();
		googleManager.login(user);
		
	}

}
