package staticDemo;

public class ProductManager
{
	public void add(Product product) 
	{
		
		if(ProductValidator.isValid(product)) {
		System.out.println("Eklendi");}
		else {System.out.println("�r�n bilgisi ge�ersiz");}
	}
}
