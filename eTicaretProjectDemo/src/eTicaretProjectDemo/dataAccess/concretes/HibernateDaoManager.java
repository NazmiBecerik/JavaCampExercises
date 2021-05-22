package eTicaretProjectDemo.dataAccess.concretes;

import java.util.List;

import eTicaretProjectDemo.dataAccess.abstracts.UserDao;
import eTicaretProjectDemo.entities.concretes.User;

public class HibernateDaoManager implements UserDao
{

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi : "+ user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi : "+ user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi : "+ user.getFirstName());
		
	}

	@Override
	public void get(int id) 
	{
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
