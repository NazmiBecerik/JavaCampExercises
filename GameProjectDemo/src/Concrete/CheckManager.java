package Concrete;

import Abstract.CheckService;
import Entities.Gamer;

public class CheckManager implements CheckService
{
	  
	public CheckManager() 
	{
		
	}
	
	@Override
	public boolean checkIfRealPerson(Gamer gamer) 
	{
		if(gamer.getFirtsName()=="NAZM�"&&gamer.getLastName()=="BECER�K"&&gamer.getNationalityNumber()=="25858240712"&&gamer.getBirthDay()=="1999")
		{
		return true;
		}
		else 
		{
			return false;
		}
	}
	
}
