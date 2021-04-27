package miniProjeHarfler;

public class Main {

	public static void main(String[] args) 
	{
		char girilenHarf='ü';
		boolean kalinSesli=false;
		boolean inceSesli=false;
		char[] kalinSesliHarfler=new char[] {'A','O','U','I','a','o','u','ý'};
		char[] inceSesliHarfler=new char[] {'E','Ý','Ö','Ü','e','i','ö','ü'};
		int buyukSayi=kalinSesliHarfler.length;
		if(inceSesliHarfler.length>buyukSayi) 
		{
			buyukSayi=inceSesliHarfler.length;
		}
		for(int i =0;i<buyukSayi;i++) 
		{
			if(girilenHarf==kalinSesliHarfler[i]) 
			{
				kalinSesli=true;
			}
			else if (girilenHarf==inceSesliHarfler[i]) 
			{
				inceSesli=true;
			}
		}
		if(kalinSesli) 
		{
			System.out.println(girilenHarf+" Kalýn Seslidir");
		}
		else
		{
			System.out.println(girilenHarf+" Ýnce Seslidir");
		}

	}

}
