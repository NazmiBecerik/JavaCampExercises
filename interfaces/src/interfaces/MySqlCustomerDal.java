package interfaces;

public class MySqlCustomerDal implements ICustomerDal , IRepository
{

	@Override
	public void Add()
	{
		System.out.println("MYSQL veri tabanýna eklendi ");
		
	}
	
}
