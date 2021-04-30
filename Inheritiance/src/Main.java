
public class Main 
{

	public static void main(String[] args) 
	{
		User student1 = new Student(0,"Java","Nazmi","Becerik","1234");
		User instructor1 = new Instructor(1,"Java","Engin","Demiroğ","5678");	
		
		UserManager userManager=new StudentManager();
		UserManager userManager1=new InstructorManager();
		userManager.Add(student1);
		userManager1.Add(instructor1);
		/// ÖNEMLİ -----------------------------
		((StudentManager)userManager).EKLE();
	}

}
