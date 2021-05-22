package eTicaretProjectDemo.business.abstracts;

import eTicaretProjectDemo.entities.concretes.User;

public interface userService 
{
	void register(User user);
	void login(User user);
	
	
}
