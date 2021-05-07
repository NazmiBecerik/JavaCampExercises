package Concrete;

import Abstract.PersonCheckService;
import Entities.Customer;

public class PersonCheckManager implements PersonCheckService
{

	@Override
	public boolean chechIfRealPerson(Customer customer) 
	{
		if(customer.getFirstName()=="NAZMÝ"&&customer.getDateOfYear()==1999&&customer.getLastName()=="BECERÝK")
		{
		return true;
		}
		else {
			System.out.println("Kullanýcý bilgileri yanlýþ");
			return false;
			
		}
		
	}

}
