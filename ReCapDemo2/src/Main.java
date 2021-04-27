
public class Main 
{

	public static void main(String[] args)
	{
		double[]myList = {1.2,2,3,4,5,6,7};
		// BU ÞEKÝLDE OLUÞTURULSA OTOMATÝK NEWLENÝR 
		double total=0;
		double max = myList[0];
		for(double number : myList)
		{
			if(max<number) 
			{
				max = number;
							}
			
			total = total+number;
			System.out.println(number);
		}
		System.out.println("Toplam deðer :"+total);
		System.out.println("En büyük sayý : "+max);


	}

}
