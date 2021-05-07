package interfaceVeAbstractDemo;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.PersonCheckManager;
import Concrete.StarbuckCustomerManager;
import Entities.Customer;
public class Main 
{
	public static void main(String[] args) throws NumberFormatException, RemoteException 
	{
		Customer customer1 = new Customer(1,"NAZMÝ","BECERÝK",1899,"25858240712");
		BaseCustomerManager customerManager = new StarbuckCustomerManager(new PersonCheckManager());
		customerManager.save(customer1);
		
	}
}
