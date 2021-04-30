
public class Courses
{
	int id;
	String courseName;
	
	public Courses(String courseName,int id) 
	{
		super();
		this.courseName=courseName;
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getCourseName()
	{
		return courseName;
	}
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	

}
