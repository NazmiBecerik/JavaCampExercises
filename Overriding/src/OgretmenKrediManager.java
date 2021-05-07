
public class OgretmenKrediManager extends BaseKrediManager
{
	@Override
	public double Hesapla(double tutar) 
	{
		return tutar * 1.18 + 5 ;
	}
}
