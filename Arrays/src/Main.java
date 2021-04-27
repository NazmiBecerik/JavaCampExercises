
public class Main {

	public static void main(String[] args) 
	{
		String[] ogrenciler = new String [4];
		ogrenciler[0]="Nazmi";
		ogrenciler[1]="Mehmet";
		ogrenciler[2]="Feyza";
		ogrenciler[3]="Esra";
		
		// FOREACH
		for(String ogrenci : ogrenciler) 
		{
			System.out.println(ogrenci);
		}
		
		System.out.println("FOREACH BÝTTÝ---------------");
		//FOR
		
		for(int i = 0;i<ogrenciler.length;i++)
//			{
			System.out.println(ogrenciler[i]);
			}
		

	}
