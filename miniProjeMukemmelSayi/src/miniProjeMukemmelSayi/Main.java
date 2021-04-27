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
			System.out.println("Mükemmel Sayi Girdiniz");
			System.out.println("Girilen Sayý : "+girilenSayi+" Bölenler Toplamý: "+toplam);
		}
		else 
		{
			System.out.println("Hiçbir þey mükemmel deðildir! ");
			System.out.println("Girilen Sayý : "+girilenSayi+" Bölenler Toplamý: "+toplam);
		}
	}
}
