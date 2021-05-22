package eTicaretProjectDemo.dataAccess.abstracts;

import java.util.List;

import eTicaretProjectDemo.entities.concretes.User;

public interface UserDao 
{
	void add(User user);
	void delete(User user);
	void update(User user);
	void get(int id );
	List<User> getAll();
	
}
