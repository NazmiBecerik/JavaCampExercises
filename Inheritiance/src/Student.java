
public class Student extends User
{
	private String studentNumber;

	public Student(int id, String courseName, String firstName, String lastName,String studentNumber) 
	{
		super(id, courseName, firstName, lastName);
		this.studentNumber=studentNumber;
		
	}
	public String getStudentNumber() 
	{
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber)
	{
		this.studentNumber = studentNumber;
	}
	
}
