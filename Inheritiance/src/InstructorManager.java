
public class InstructorManager extends UserManager
{
	@Override
	public void Add(User user) 
	{
		System.out.println("��retmen, "+user.getFirstName()+" Eklendi");
	}
}
