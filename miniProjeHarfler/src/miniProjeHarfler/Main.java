package miniProjeHarfler;

public class Main {

	public static void main(String[] args) 
	{
		char girilenHarf='�';
		boolean kalinSesli=false;
		boolean inceSesli=false;
		char[] kalinSesliHarfler=new char[] {'A','O','U','I','a','o','u','�'};
		char[] inceSesliHarfler=new char[] {'E','�','�','�','e','i','�','�'};
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
			System.out.println(girilenHarf+" Kal�n Seslidir");
		}
		else
		{
			System.out.println(girilenHarf+" �nce Seslidir");
		}

	}

}
