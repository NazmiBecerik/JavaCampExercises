package multiDimensionArrays;

public class Main
{

	public static void main(String[] args)
	{
		// BÖLGELERE GÖRE ÞEHÝRLER - 2 BÖLGE 2 ÞEHÝR ÞEKLÝNDE YAZACAÐIM
		String[][] Sehirler= new String [2][2];
		Sehirler[0][0]="Ýzmir";
		Sehirler[0][1]="Aydýn";
		Sehirler[1][0]="Ýstanbul";
		Sehirler[1][1]="Bursa";
		
		for(int i =0;i<2;i++) 
		{
			if(i==0)
			{
				System.out.println("---------Ege bölgesi------------");
			
			}
			if(i==1)
			{
				System.out.println("---------Marmara bölgesi----------");
			
			}
			for(int j = 0 ; j<2;j++) 
			{
				System.out.println(Sehirler[i][j]);
			}
		}
	}

}
