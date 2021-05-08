package ConsoleUI;

import Concrete.CheckManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main 
{

	public static void main(String[] args) 
	{
		Gamer gamer1 = new Gamer(1,"NAZMÝ","BECERK","25858240712","1999");
		CheckManager checkManager = new CheckManager();
		
		if(checkManager.checkIfRealPerson(gamer1)) 
		{
			Campaign campaign1 = new Campaign(1, "Black Friday", "08.10.1999",20);
			Game game1=new Game(1, "GTA V", 200);
			SalesManager sales1 = new SalesManager();
			sales1.sellNormal(game1, gamer1);
			sales1.sellWithCampaign(game1, gamer1, campaign1);
		}
		else 
		{
			System.out.println("Oyuncu bilgilerini kontrol ediniz");
		}
		
	
	}

}
