
public class Main 
{

	public static void main(String[] args)
	{
		double[]myList = {1.2,2,3,4,5,6,7};
		// BU �EK�LDE OLU�TURULSA OTOMAT�K NEWLEN�R 
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
		System.out.println("Toplam de�er :"+total);
		System.out.println("En b�y�k say� : "+max);


	}

}
