package miniProjeAsalSayi;

public class Main 
{

	public static void main(String[] args) 
	{
		int girilenSayi=30;
		boolean asalMi=false;
		for(int i = 3;i<=girilenSayi;i++) 
		{
			if(girilenSayi%i==0) 
			{
				asalMi=false;
			}
			else 
			{
				asalMi=true;
			}
		}
		if(asalMi) 
		{
			System.out.println(girilenSayi+" Asal sayýdýr.");
		}
		else 
		{
			System.out.println(girilenSayi+" Asal sayý deðildir.");
		}
	

	}

}
