package core.abstracts;

import eTicaretProjectDemo.entities.concretes.User;

public interface AuthorizeService 
{
	void register(User user);
	void login(User user);
}
