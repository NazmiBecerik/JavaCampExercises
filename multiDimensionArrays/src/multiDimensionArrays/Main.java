package multiDimensionArrays;

public class Main
{

	public static void main(String[] args)
	{
		// B�LGELERE G�RE �EH�RLER - 2 B�LGE 2 �EH�R �EKL�NDE YAZACA�IM
		String[][] Sehirler= new String [2][2];
		Sehirler[0][0]="�zmir";
		Sehirler[0][1]="Ayd�n";
		Sehirler[1][0]="�stanbul";
		Sehirler[1][1]="Bursa";
		
		for(int i =0;i<2;i++) 
		{
			if(i==0)
			{
				System.out.println("---------Ege b�lgesi------------");
			
			}
			if(i==1)
			{
				System.out.println("---------Marmara b�lgesi----------");
			
			}
			for(int j = 0 ; j<2;j++) 
			{
				System.out.println(Sehirler[i][j]);
			}
		}
	}

}
