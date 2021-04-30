
public class Main
{

	public static void main(String[] args) 
	{
		String mesaj = "Bug�n hava �ok g�zel";
		String yeniMesaj = mesaj.substring(0,2);
		System.out.println(yeniMesaj);
		System.out.println(Topla(3,5));
		System.out.println(topla2(1,3,5,8));
	}
	// VO�D OPERASYONLARI -- EKLE S�L G�NCELLE G�B� EM�RLER VERD���M�Z ONLARI YAPAN FONKS�YONLARDIR.

	public static void Ekle() 
	{
		System.out.println("Eklendi");
	}
	public static void Sil() 
	{
		System.out.println("Silindi");
	}
	public static void Guncelle() 
	{
		System.out.println("G�ncellendi");
	}
	
	public static int Topla(int sayi1,int sayi2) 
	{
		return sayi1+sayi2;
	}
	public static String Sehir () 
	{
		return "Ankara";
	}
	
	public static int topla2(int...sayilar ) 
	{
		int toplam = 0;
		for(int sayi : sayilar)	
		{
			toplam+=sayi;
		}
		return toplam;
	}
}
