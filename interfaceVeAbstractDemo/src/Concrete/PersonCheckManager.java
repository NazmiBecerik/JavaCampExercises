package Concrete;

import Abstract.PersonCheckService;
import Entities.Customer;

public class PersonCheckManager implements PersonCheckService
{

	@Override
	public boolean chechIfRealPerson(Customer customer) 
	{
		if(customer.getFirstName()=="NAZM�"&&customer.getDateOfYear()==1999&&customer.getLastName()=="BECER�K")
		{
		return true;
		}
		else {
			System.out.println("Kullan�c� bilgileri yanl��");
			return false;
			
		}
		
	}

}
