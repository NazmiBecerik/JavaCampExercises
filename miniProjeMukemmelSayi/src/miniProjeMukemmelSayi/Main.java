package miniProjeMukemmelSayi;

public class Main 
{

	public static void main(String[] args) 
	{
		int girilenSayi=28;
		int toplam=0;
		for(int i=1;i<girilenSayi;i++) 
		{
			if(girilenSayi%i==0) 
			{
				toplam=toplam+i;
			}
		}		
		if(toplam==girilenSayi) 
		{
			System.out.println("M�kemmel Sayi Girdiniz");
			System.out.println("Girilen Say� : "+girilenSayi+" B�lenler Toplam�: "+toplam);
		}
		else 
		{
			System.out.println("Hi�bir �ey m�kemmel de�ildir! ");
			System.out.println("Girilen Say� : "+girilenSayi+" B�lenler Toplam�: "+toplam);
		}
	}
}
