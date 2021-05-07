package Adapters;

import Abstract.PersonCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements PersonCheckService
{

	@Override
	public boolean chechIfRealPerson(Customer customer)
	{
		 return false;
	}

}
