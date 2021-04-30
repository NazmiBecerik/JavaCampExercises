
public class Instructor extends User
{
	String instructorNumber ;
	Instructor(int id, String courseName, String firstName, String lastName,String instructorNumber)
	{
		super(id, courseName, firstName, lastName);
		this.instructorNumber=instructorNumber;
	}

}
