package miniProjeArkadasSayilar;

public class Main {

	public static void main(String[] args) 
	{
		int girilenSayi1=284;
		int girilenSayi2=220;
		int toplam1=0;
		int toplam2=0;
		for(int i=1;i<girilenSayi1;i++) 
		{
			if(girilenSayi1%i==0) 
			{
				toplam1=toplam1+i;
			}
		}	
		for(int i=1;i<girilenSayi2;i++) 
		{
			if(girilenSayi2%i==0) 
			{
				toplam2=toplam2+i;
			}
		}
		
		if(toplam1==girilenSayi2&&toplam2==girilenSayi1) 
		{
			System.out.println("ARKADAÞ SAYI GÝRDÝNÝZ");
		}
		else 
		{
			System.out.println("GÝRDÝÐÝNÝZ SAYILAR ARKADAÞ SAYI DEÐÝLDÝR");
		}
	
	
	}

}
